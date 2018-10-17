package com.spades.of.ace.wodeblog.misc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Helpers {

    private static final ObjectMapper om = new ObjectMapper();




    public static String arrayToJsonString(final Object object) {
        String result = "";
        try {
            result = om.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        return result;    }
}
