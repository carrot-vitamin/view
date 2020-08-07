<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <script src="/jquery.min.js"></script>
    <!-- 引入 echarts.js -->
    <script src="/echarts/dist/echarts.min.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));

    // 异步加载数据
    $.get('/eCharts/data').done(function (data) {
        // 填入数据
        myChart.setOption({
            title: {
                text: data.title
            },
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:data.legend
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                boundaryGap: false,
                data: data.xAxis
            },
            yAxis: {
                type: 'value'
            },
            series: data.series
        });
    });
</script>
</body>
</html>