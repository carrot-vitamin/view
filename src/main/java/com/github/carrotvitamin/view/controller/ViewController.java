package com.github.carrotvitamin.view.controller;

import com.project.api.life.model.actuator.WeatherActuator;
import com.project.api.life.model.request.WeatherRequest;
import com.project.api.life.model.response.WeatherResponse;
import com.project.base.util.FileUtils;
import com.project.base.util.XmlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileNotFoundException;

/**
 * @author ShaoBo Yin at 2020/1/19 18:11
 */
@Slf4j
@Controller
public class ViewController {

    @GetMapping
    public String view() {
        return "index";
    }

    @GetMapping("/weather")
    public String weather(WeatherRequest request, Model model) throws FileNotFoundException {
        WeatherResponse response;
        try {
            response = new WeatherActuator(request).execute();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            String path = FileUtils.getResourceFilePath("weather.xml");
            String s = FileUtils.readTextContent(path);
            response = XmlUtils.xmlToBean(s, WeatherResponse.class);
        }

        model.addAttribute("res", response);

        return "weather";
    }
}
