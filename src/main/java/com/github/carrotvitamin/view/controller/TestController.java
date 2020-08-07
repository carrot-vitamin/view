package com.github.carrotvitamin.view.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * @author yinshaobo
 * @date 2019/12/24 22:44
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/ttt")
    public JSONObject ttt(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        Enumeration<String> parameterNames = request.getParameterNames();
        StringBuilder builder = new StringBuilder();
        while (parameterNames.hasMoreElements()) {
            String s = parameterNames.nextElement();
            builder.append(s).append("=").append(request.getParameter(s)).append(";");
        }
        jsonObject.put("message", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        jsonObject.put("data", "view test data");
        return jsonObject;
    }

    @PutMapping
    public JSONObject test(HttpServletRequest request) throws Exception {
        return buildReqData(request);
    }

    public JSONObject buildReqData(HttpServletRequest request) throws Exception {
        JSONObject header = new JSONObject();
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String s = names.nextElement();
            header.put(s, request.getHeader(s));
        }

        JSONObject params = new JSONObject();
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String s = parameterNames.nextElement();
            params.put(s, request.getParameter(s));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), StandardCharsets.UTF_8));
        StringBuilder builder = new StringBuilder();
        String inputStr;
        while ((inputStr = reader.readLine()) != null) {
            builder.append(inputStr);
        }

        JSONObject bodyObject = new JSONObject();
        Object body;
        try {
            body = JSONObject.parse(builder.toString());
            bodyObject.put("json", body);
        } catch (Exception e) {
            body = builder.toString();
            bodyObject.put("form", body);
        }


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("header", header);
        jsonObject.put("params", params);
        jsonObject.put("body", bodyObject);

        return jsonObject;
    }
}
