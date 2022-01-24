package com.technokid.WeatherDesktopApp.API;

public class Weather {
	public String location;
	public String time;
	public String temp;
	public String status;
	public String statusDesc;
	public String airQuality;
	public String airQualityTitle;
	public String airQualityDesc;
	public String weatherTodayTitle;
	public String weatherTodayTemp;
	public String weatherTodaySunrise;
	public String weatherTodaySunSet;
	public String weatherTodayHighLow;
	public String weatherTodayWind;
	public String weatherTodayHumidity;
	public String weatherTodayDewPoint;
	public String weatherTodayPressure;
	public String weatherTodayUVIndex;
	public String weatherTodayVisibility;
	public String weatherTodayMoonPhase;
	public String url;
	public boolean day;
	public boolean night;

	public String getLocation() {
		return location;
	}

	public String getTime() {
		return time;
	}

	public String getTemp() {
		return temp;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public String getAirQuality() {
		return airQuality;
	}

	public String getAirQualityTitle() {
		return airQualityTitle;
	}

	public String getAirQualityDesc() {
		return airQualityDesc;
	}

	public String getWeatherTodayTitle() {
		return weatherTodayTitle;
	}

	public String getWeatherTodayTemp() {
		return weatherTodayTemp;
	}

	public String getWeatherTodaySunrise() {
		return weatherTodaySunrise;
	}

	public String getWeatherTodaySunSet() {
		return weatherTodaySunSet;
	}

	public String getWeatherTodayHighLow() {
		return weatherTodayHighLow;
	}

	public String getWeatherTodayWind() {
		return weatherTodayWind;
	}

	public String getWeatherTodayHumidity() {
		return weatherTodayHumidity;
	}

	public String getWeatherTodayDewPoint() {
		return weatherTodayDewPoint;
	}

	public String getWeatherTodayPressure() {
		return weatherTodayPressure;
	}

	public String getWeatherTodayUVIndex() {
		return weatherTodayUVIndex;
	}

	public String getWeatherTodayVisibility() {
		return weatherTodayVisibility;
	}

	public String getWeatherTodayMoonPhase() {
		return weatherTodayMoonPhase;
	}

	public String getUrl() {
		return url;
	}

	public boolean isDay() {
		return day;
	}

	public boolean isNight() {
		return night;
	}

	@Override
	public String toString() {
		return "Weather [location=" + location + ", time=" + time + ", temp=" + temp + ", status=" + status
				+ ", statusDesc=" + statusDesc + ", airQuality=" + airQuality + ", airQualityTitle=" + airQualityTitle
				+ ", airQualityDesc=" + airQualityDesc + ", weatherTodayTitle=" + weatherTodayTitle
				+ ", weatherTodayTemp=" + weatherTodayTemp + ", weatherTodaySunrise=" + weatherTodaySunrise
				+ ", weatherTodaySunSet=" + weatherTodaySunSet + ", weatherTodayHighLow=" + weatherTodayHighLow
				+ ", weatherTodayWind=" + weatherTodayWind + ", weatherTodayHumidity=" + weatherTodayHumidity
				+ ", weatherTodayDewPoint=" + weatherTodayDewPoint + ", weatherTodayPressure=" + weatherTodayPressure
				+ ", weatherTodayUVIndex=" + weatherTodayUVIndex + ", weatherTodayVisibility=" + weatherTodayVisibility
				+ ", weatherTodayMoonPhase=" + weatherTodayMoonPhase + ", url=" + url + ", day=" + day + ", night="
				+ night + "]";
	}

}
