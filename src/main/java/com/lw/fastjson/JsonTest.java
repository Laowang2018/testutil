package com.lw.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
    public static void main(String[] args) {
        String name = getName();
        System.out.println(name);


    }


    private static String getName() {
        String name = "laowang";
        String value;
        try {
            JSONObject response = JSON.parseObject("");
            value = response.getString("name");
        } catch (Exception e) {
            return "Error";
        }
        return value;
    }
}
