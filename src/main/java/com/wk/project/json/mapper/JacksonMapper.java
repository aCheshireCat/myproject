package com.wk.project.json.mapper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Auther weikai2
 * @Date 2024/3/1
 * @Description
 **/
public class JacksonMapper extends ObjectMapper{

    public JacksonMapper(){
        super();
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {

            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                String fieldName = jsonGenerator.getOutputContext().getCurrentName();
                try {
                    Field field = jsonGenerator.getCurrentValue().getClass().getDeclaredField(fieldName);
                    if(Objects.equals(field.getType(),String.class)){
                        jsonGenerator.writeString("");
                        return;
                    }

                    if(Objects.equals(field.getType(), List.class)){
                        jsonGenerator.writeStartArray();
                        jsonGenerator.writeEndArray();
                        return;
                    }

                    if(Objects.equals(field.getType(), Map.class)){
                        jsonGenerator.writeStartArray();
                        jsonGenerator.writeEndArray();
                        return;
                    }

                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }

                jsonGenerator.writeString("");
            }
        });
    }


}
