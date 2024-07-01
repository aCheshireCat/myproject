package com.wk.project.util;

import cn.hutool.core.util.NumberUtil;
import com.longi.msp.common.exception.CommonException;
import com.wk.project.utils.RegexUtil;
import io.lettuce.core.output.ScanOutput;

import java.util.Optional;

/**
 * @Auther weikai2
 * @Date 2024/4/30
 * @Description
 **/
public class OptionalUtilTest {

    private static String reg = "^[0-9]\\d*$";
    public static void main(String[] args) {

        Object obj = new String("-1");
//        Object obj = null;
        System.out.println(Optional.ofNullable(obj).isPresent());

        System.out.println(NumberUtil.isNumber(obj.toString()));

        System.out.println(NumberUtil.isInteger(obj.toString().trim()));

        System.out.println(RegexUtil.is(obj.toString().trim(),reg));

        assertTrue(Optional.ofNullable(obj).isPresent()
                && RegexUtil.is(obj.toString().trim(),reg)
                ,"error");

    }

    public static void assertTrue(boolean condition, String exceptionMessage) {
        if (!condition) {
//            System.out.println("");
            throw new CommonException(exceptionMessage);
        }
    }

}
