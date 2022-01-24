package com.technokid.WeatherDesktopApp;

import java.net.URL;
import java.util.ResourceBundle;

import com.technokid.WeatherDesktopApp.API.Weather;
import com.technokid.WeatherDesktopApp.API.WeatherAPI;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller extends WeatherAPI implements Initializable {

	@FXML
	private Text airQualityDesc;

	@FXML
	private Text airQualityHeader;

	@FXML
	private ProgressBar airQualityProgress;

	@FXML
	private Label dwp;

	@FXML
	private Label headerStat;

	@FXML
	private Label headerStatDesc;

	@FXML
	private Label headerTemp;

	@FXML
	private Label highLow;

	@FXML
	private Label humidity;

	@FXML
	private TextField inpLocation;

	@FXML
	private Label location;

	@FXML
	private Label mainLocDesc;

	@FXML
	private Label mainTemp;

	@FXML
	private Label moonP;

	@FXML
	private Label pressure;

	@FXML
	private Label time;

	@FXML
	private Label uv;

	@FXML
	private Label visibility;

	@FXML
	private Label wind;

	@FXML
	private AnchorPane title;

	@FXML
	private AnchorPane main;

	@FXML
	private ImageView backImg;

	@FXML
	private ImageView titleBg;

	@FXML
	private AnchorPane root;

	@FXML
	private ImageView loader;

	@FXML
	private Label qualityValue;

	private Weather weather;
	private String imgUrl;
	private String currLoc;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loader.setVisible(false);
		loadInitialData();
	}

	public void loadInitialData() {
		inpLocation.setEditable(false);
		loader.setVisible(true);
		title.setVisible(false);
		main.setVisible(false);
		backImg.setImage(new Image(
				"https://s.w-x.co/WeatherImages_Web/WeatherImage_Sunny-day_4.jpg?crop=16:9&width=1200&height=900&format=pjpg&auto=webp&quality=100"));
		titleBg.setImage(new Image(
				"https://s.w-x.co/WeatherImages_Web/WeatherImage_Sunny-day_4.jpg?crop=16:9&width=1200&height=9000&format=pjpg&auto=webp&quality=100"));
		Thread thread = new Thread(() -> {
			currLoc = getLocation();
			weather = fetchWeatherData(currLoc);
			Platform.runLater(() -> {
				if (weather != null) {
					inpLocation.setText(currLoc);
					location.setMaxWidth(weather.getLocation().toCharArray().length * 200);
					imgUrl = weather.getUrl();
					imgUrl = imgUrl.split("\\?")[0];
					imgUrl = imgUrl + "?crop=16:9&width=1200&height=900&format=pjpg&auto=webp&quality=100";
					System.out.println(imgUrl);
					location.setText(weather.getLocation());
					time.setText(weather.getTime());
					headerTemp.setText(weather.getTemp());
					headerStat.setText(weather.getStatus());
					headerStatDesc.setText(weather.getStatusDesc());
					airQualityHeader.setText(weather.getAirQualityTitle());
					airQualityDesc.setText(weather.getAirQualityDesc());
					double airQualityPer = Double.parseDouble(weather.getAirQuality().trim()) / 500;
					System.out.println("AIR QUALITY:-" + airQualityPer);
					airQualityProgress.setProgress(airQualityPer);
					mainLocDesc.setText(weather.getWeatherTodayTitle());
					mainTemp.setText(weather.getWeatherTodayTemp());
					titleBg.setImage(new Image(imgUrl));
					backImg.setImage(new Image(imgUrl));
					highLow.setText(weather.getWeatherTodayHighLow());
					wind.setText(weather.getWeatherTodayWind());
					humidity.setText(weather.getWeatherTodayHumidity());
					dwp.setText(weather.getWeatherTodayDewPoint());
					pressure.setText(weather.getWeatherTodayPressure());
					uv.setText(weather.getWeatherTodayUVIndex());
					visibility.setText(weather.getWeatherTodayVisibility());
					moonP.setText(weather.getWeatherTodayMoonPhase());
					qualityValue.setText(weather.getAirQuality());
					loader.setVisible(false);
					title.setVisible(true);
					main.setVisible(true);
					inpLocation.setEditable(true);
				} else {
					loader.setVisible(false);
					title.setVisible(true);
					main.setVisible(true);
					inpLocation.setEditable(true);
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error");
					alert.setContentText("Location Not Found");
					alert.show();
				}
			});
		});
		thread.start();
	}

	public void loadNewLocationData() {
		inpLocation.setEditable(false);
		loader.setVisible(true);
		title.setVisible(false);
		main.setVisible(false);
		backImg.setImage(new Image(
				"https://s.w-x.co/WeatherImages_Web/WeatherImage_Sunny-day_4.jpg?crop=16:9&width=1200&height=900&format=pjpg&auto=webp&quality=100"));
		titleBg.setImage(new Image(
				"https://s.w-x.co/WeatherImages_Web/WeatherImage_Sunny-day_4.jpg?crop=16:9&width=1200&height=9000&format=pjpg&auto=webp&quality=100"));
		Thread thread = new Thread(() -> {
			weather = fetchWeatherData(inpLocation.getText());
			Platform.runLater(() -> {
				if (weather != null) {
					imgUrl = weather.getUrl();
					imgUrl = imgUrl.split("\\?")[0];
					imgUrl = imgUrl + "?crop=16:9&width=1200&height=900&format=pjpg&auto=webp&quality=100";
					System.out.println(imgUrl);
					location.setText(weather.getLocation());
					location.setMaxWidth(weather.getLocation().toCharArray().length * 200);
					time.setText(weather.getTime());
					headerTemp.setText(weather.getTemp());
					headerStat.setText(weather.getStatus());
					headerStatDesc.setText(weather.getStatusDesc());
					airQualityHeader.setText(weather.getAirQualityTitle());
					airQualityDesc.setText(weather.getAirQualityDesc());
					double airQualityPer = Double.parseDouble(weather.getAirQuality().trim()) / 500;
					System.out.println("AIR QUALITY:-" + airQualityPer);
					airQualityProgress.setProgress(airQualityPer);
					mainLocDesc.setText(weather.getWeatherTodayTitle());
					mainTemp.setText(weather.getWeatherTodayTemp());
					titleBg.setImage(new Image(imgUrl));
					backImg.setImage(new Image(imgUrl));
					highLow.setText(weather.getWeatherTodayHighLow());
					wind.setText(weather.getWeatherTodayWind());
					humidity.setText(weather.getWeatherTodayHumidity());
					dwp.setText(weather.getWeatherTodayDewPoint());
					pressure.setText(weather.getWeatherTodayPressure());
					uv.setText(weather.getWeatherTodayUVIndex());
					visibility.setText(weather.getWeatherTodayVisibility());
					moonP.setText(weather.getWeatherTodayMoonPhase());
					qualityValue.setText(weather.getAirQuality());
					loader.setVisible(false);
					title.setVisible(true);
					main.setVisible(true);
					inpLocation.setEditable(true);
				} else {
					loader.setVisible(false);
					title.setVisible(true);
					main.setVisible(true);
					inpLocation.setEditable(true);
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error");
					alert.setContentText("Location Not Found");
					alert.show();
				}
			});
		});
		thread.start();
	}

}
