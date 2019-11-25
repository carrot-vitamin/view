package com.github.carrotvitamin.view.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shaobo Yin at 2019/11/25 16:32
 */
@RestController
@RequestMapping("/eCharts")
public class EChartsDataController {

    @GetMapping("/data")
    public JSONObject data() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "折线图堆叠");
        jsonObject.put("legend", Arrays.asList("邮件营销","联盟广告","视频广告","直接访问","搜索引擎"));
        jsonObject.put("xAxis", Arrays.asList("周一","周二","周三","周四","周五","周六","周日"));

        List<JSONObject> series = this.buildSeries();
        jsonObject.put("series", series);

        return jsonObject;
    }

    private List<JSONObject> buildSeries() {
        List<JSONObject> series = new ArrayList<>();
        series.add(this.buildJSONObject("邮件营销", Arrays.asList(120, 132, 101, 134, 90, 230, 210)));
        series.add(this.buildJSONObject("联盟广告", Arrays.asList(220, 182, 191, 234, 290, 330, 310)));
        series.add(this.buildJSONObject("视频广告", Arrays.asList(150, 232, 201, 154, 190, 330, 410)));
        series.add(this.buildJSONObject("直接访问", Arrays.asList(320, 332, 301, 334, 390, 330, 320)));
        series.add(this.buildJSONObject("搜索引擎", Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320)));
        return series;
    }

    private JSONObject buildJSONObject(String name, List<Integer> data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("type", "line");
        jsonObject.put("stack", "总量");
        jsonObject.put("data", data);
        return jsonObject;
    }
}
