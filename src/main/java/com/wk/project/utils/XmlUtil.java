package com.wk.project.utils;

import com.wk.project.webservice.info.erp.*;

import javax.xml.bind.*;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther weikai2
 * @Date 2023/7/13
 * @Description
 **/
public class XmlUtil {

    public static final String DEFAULT_ENCODING = "UTF-8";

    public static String converToXml(Object obj) throws  Exception{
        return converToXml(obj,DEFAULT_ENCODING);
    }


    public static<T> T convertToObject(String output,Class<T> parent) throws Exception{
        JAXBContext context = JAXBContext.newInstance(parent);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (T)unmarshaller.unmarshal(new StringReader(output));
    }

    private static String converToXml(Object obj, String defaultEncoding) throws JAXBException {
        String result = null;
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();

//        marshaller.setProperty("com.sun.xml.bind.xmlDeclaration",Boolean.FALSE);

        marshaller.setProperty("jaxb.fragment", true);

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING,defaultEncoding);
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        result = writer.toString();

        return result;
    }

    public static void main(String[] args) throws Exception {

        ObjectFactory factory = new ObjectFactory();

        InputParameters inputParameters = factory.createInputParameters();

        APPSCUXOMOMS2DELIX1798393X1X1 X1 = factory.createAPPSCUXOMOMS2DELIX1798393X1X1();
        X1.setATTR1(factory.createAPPSCUXOMOMS2DELIX1798393X1X1ATTR1("111"));
        X1.setATTR2(factory.createAPPSCUXOMOMS2DELIX1798393X1X1ATTR2("222"));
        X1.setATTR3(factory.createAPPSCUXOMOMS2DELIX1798393X1X1ATTR3("333"));
        X1.setPRODUCERREQUESTTIME(factory.createAPPSCUXOMOMS2DELIX1798393X1X1PRODUCERREQUESTTIME("2023-07-13"));

        inputParameters.setPRODUCERREQUESTHEAD(factory.createInputParametersPRODUCERREQUESTHEAD(
                X1
        ));


        APPSCUXOMOMS2DELX1798393X1X15 X15 = factory.createAPPSCUXOMOMS2DELX1798393X1X15();

        APPSCUXOMOMS2DELX1798393X1X16 X16 = new APPSCUXOMOMS2DELX1798393X1X16();
        X16.setORGCODE(factory.createAPPSCUXOMOMS2DELX1798393X1X16ORGCODE("22230"));
        X16.setADDRESSID(factory.createAPPSCUXOMOMS2DELX1798393X1X16ADDRESSID("地址id"));
        X16.setCURRENCY(factory.createAPPSCUXOMOMS2DELX1798393X1X16CURRENCY("CNY"));
        X16.setFREIGHTTERMS(factory.createAPPSCUXOMOMS2DELX1798393X1X16FREIGHTTERMS("test"));

        APPSCUXOMOMS2DELX1798393X1X56 X56 = factory.createAPPSCUXOMOMS2DELX1798393X1X56();
        X56.setATTR1(factory.createAPPSCUXOMOMS2DELX1798393X1X56ATTR1("attr1"));

        APPSCUXOMOMS2DELX1798393X1X56 X56_2 = factory.createAPPSCUXOMOMS2DELX1798393X1X56();
        X56_2.setATTR1(factory.createAPPSCUXOMOMS2DELX1798393X1X56ATTR2("attr2"));

        APPSCUXOMOMS2DELX1798393X1X55 X55 = factory.createAPPSCUXOMOMS2DELX1798393X1X55();

        X55.getLINESITEM().add(X56);
        X55.getLINESITEM().add(X56_2);
        X16.setLINES(factory.createAPPSCUXOMOMS2DELX1798393X1X16LINES(X55));
        X15.getPRODUCERREQUESTDATAITEM().add(X16);
        inputParameters.setPRODUCERREQUESTDATA(factory.createInputParametersPRODUCERREQUESTDATA(
                X15
        ));

        System.out.println(converToXml( inputParameters));


    }


}
