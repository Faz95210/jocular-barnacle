package com.spades.of.ace.wodeblog.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Contact extends Controller {

    @RequestMapping(method = RequestMethod.GET, path = "/contact")
    @ResponseBody
    public ModelAndView serve() {
        return new ModelAndView("contact", model);
    }

}
