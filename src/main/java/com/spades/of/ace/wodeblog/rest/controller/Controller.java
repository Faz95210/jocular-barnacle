package com.spades.of.ace.wodeblog.rest.controller;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public abstract class Controller {
    final Map<String, Object> model = new HashMap<>();

    private String getStaticResourcesPath() {
        final URL resource = this.getClass().getResource("/static");
        File file;
        try {
            file = new File(resource.toURI());
        } catch (URISyntaxException e) {
            file = new File(resource.getPath());
        }
        return file.getPath();
    }

    public Controller() {
        model.put("title", "我的Blog");
//        model.put("resources", getStaticResourcesPath());
    }
}
