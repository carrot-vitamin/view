<!DOCTYPE html>
<html lang="zh-cmn-Hans">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="keywords" content="">
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta name="renderer" content="webkit">
		<link rel="stylesheet" type="text/css" href="/weather/base.css">
		<title>
			天气预报
		</title>
		<link rel="stylesheet" type="text/css" href="/weather/weather-current.css">
		<link rel="stylesheet" href="/weather/swiper.min.css" id="swiper-css">
	</head>
	<body class="">
		<section class="current-con">
			<section class="current-weather">
				<div class="animation-con animation-fine">
					<img class="animation-fine-big" src="/weather/fine-big.png">
					<img class="animation-fine-small" src="/weather/fine-small.png">
					<img class="animation-fine-icon01" src="/weather/fine-icon01.png">
					<img class="animation-fine-icon02" src="/weather/fine-icon02.png">
					<img class="animation-fine-icon03" src="/weather/fine-icon03.png">
				</div>
				<div class="current-detail">
					<div class="date">
						<section class="location-con">
							<a href="#"
							class="location-city js-location-city">
								<strong>
									${res.city}
								</strong>
								<i class="HWOther other-dingwei">
								</i>
							</a>
							<section class="location-form js-location-form">
								<input type="text" placeholder="请输入要查询的城市">
								<a class="location-form-btn" href="#">
								</a>
								<div class="location-form-list js-location-form-list">
								</div>
							</section>
						</section>
						<p>
							${res.forecast[0].date}
						</p>
					</div>
					<section class="weather clearFix">
						<p class="temperature">
							${res.wendu}
							<span>
								℃
							</span>
						</p>
						<div class="forecast">
							<div class="clearFix">
<#--								<img src="/weather/00.svg" alt="">-->
								<span>
									${res.forecast[0].day.type}
								</span>
							</div>
							<p>
								${res.forecast[0].low}
								<span>
									/ ${res.forecast[0].high}
								</span>
							</p>
						</div>
					</section>
					<section class="aqi-warning">
						<a href="#">
							空气质量：51&nbsp;良&nbsp;
							<span style="background-color:rgb(255,208,0)">
							</span>
						</a>
					</section>
				</div>
				<div class="shadow">
				</div>
			</section>
			<ol class="weather-other clearFix">
				<li>
					<p>
						<i class="HWOther other-wendu">
						</i>
						${res.wendu}℃
					</p>
					<span>
						温度
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-tigan">
						</i>
						2℃
					</p>
					<span>
						体感温度
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-yinyingtiganwendu">
						</i>
						0.0℃
					</p>
					<span>
						阴影体感温度
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-yunliang">
						</i>
						0%
					</p>
					<span>
						云量
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-shidu">
						</i>
						18%
					</p>
					<span>
						${res.shidu}
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-ziwaixian">
						</i>
						3级 中度
					</p>
					<span>
						紫外线
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-nengjiandu">
						</i>
						30km
					</p>
					<span>
						能见度
					</span>
				</li>
				<li>
					<p>
						<i class="HWOther other-qiyazhi">
						</i>
						1029百帕
					</p>
					<span>
						气压
					</span>
				</li>
			</ol>
			<div class="current-wind clearFix">
				<h4 class="title-level1">
					风力风向
				</h4>
				<div class="current-wind-img">
					<img class="wind-img-lb" src="/weather/wind-pillar.png">
					<img class="wind-img-lt" src="/weather/wind-fan.png">
					<img class="wind-img-rb" src="/weather/wind-pillar.png">
					<img class="wind-img-rt" src="/weather/wind-fan.png">
				</div>
				<div class="current-wind-detail">
					<p>
						<span>
							风
						</span>
						${res.fengxiang}&nbsp;${res.fengli}
					</p>
<#--					<p>-->
<#--						<span>-->
<#--							阵风-->
<#--						</span>-->
<#--						西北&nbsp;5级-->
<#--					</p>-->
				</div>
			</div>
			<section class="current-sunrise">
				<h4 class="title-level1">
					日出日落
				</h4>
				<p class="clearFix">
					<i class="HWOther other-richu">
					</i>
					日出
					<span>
						${res.sunrise1}
					</span>
					<br>
					日落
					<span>
						${res.sunset1}
					</span>
				</p>
				<p class="clearFix">
					<i class="HWOther other-yueluo">
					</i>
					月出
					<span>
						02:31
					</span>
					<br>
					月落
					<span class="js-moonset">
						13:33
					</span>
				</p>
			</section>
		</section>
	</body>

</html>