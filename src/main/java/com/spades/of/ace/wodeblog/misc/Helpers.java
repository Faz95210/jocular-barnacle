package com.spades.of.ace.wodeblog.misc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.util.Collection;

public class Helpers {

    public static final JsonParser jsonParser = new JsonParser();


    public static String arrayToJsonString(final Object[] array) {
        return new Gson().toJson(array);
    }
}
