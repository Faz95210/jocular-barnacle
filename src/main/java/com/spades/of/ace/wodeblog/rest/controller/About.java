package com.spades.of.ace.wodeblog.rest.controller;

import com.spades.of.ace.wodeblog.misc.Helpers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class About extends Controller {

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    @ResponseBody
    public ModelAndView serve() {
        setDatas();
        model.put("resources", "/resources/static");
        return new ModelAndView("about", model);
    }

    private void setDatas() {
        final String[] nameQuestions = {"My name is", "Je m'appelle", "Ich heisse", "Mi nombre es", "我叫"};
        final String[] jobQuestions = {"I am", "Je suis", "Ich bin", "Yo soy", "我是"};
        final String[] jobAnswers = {"I am from", "Je viens de ", "Softwareentwickler", "desarrollador de software", "软件开发人员"};
        final String[] countryQuestions = {"I am", "Je suis", "Ich bin", "Yo soy", "我是"};
        final String[] countryAnswers = {"French", "Français", "Französisch", "Francés", "法国人"};
        final String[] addressQuestions = {"I live in", "J'habite à", "Ich lebe in", "Vivo en", "我家在"};
        final String[] addressAnswers = {"Shenzhen, China", "深圳，中国"};

        model.put("jobQuestions", Helpers.arrayToJsonString(jobQuestions));
        model.put("jobAnswers", Helpers.arrayToJsonString(jobAnswers));
        model.put("countryQuestions", Helpers.arrayToJsonString(countryQuestions));
        model.put("countryAnswers", Helpers.arrayToJsonString(countryAnswers));
        model.put("addressQuestions", Helpers.arrayToJsonString(addressQuestions));
        model.put("addressAnswers", Helpers.arrayToJsonString(addressAnswers));
        model.put("nameQuestion", nameQuestions[(int) ((Math.random() * ((4 - 0) + 1)) + 0)]);
        model.put("jobQuestion", jobQuestions[(int) ((Math.random() * ((4 - 0) + 1)) + 0)]);
        model.put("jobAnswer", jobAnswers[(int) ((Math.random() * ((4 - 0) + 1)) + 0)]);
        model.put("countryQuestion", countryQuestions[(int) ((Math.random() * ((4 - 0) + 1)) + 0)]);
        model.put("countryAnswer", countryAnswers[(int) ((Math.random() * ((4 - 0) + 1)) + 0)]);
        model.put("addressQuestion", addressQuestions[(int) ((Math.random() * ((4 - 0) + 1)) + 0)]);
        model.put("addressAnswer", addressAnswers[(int) ((Math.random() * ((1 - 0) + 1)) + 0)]);
        model.put("gbFlag", "/img/flags/gb.svg");
    }
}
