module com.technokid.WeatherDesktopApp {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.google.gson;
	requires java.net.http;
	requires com.fasterxml.jackson.databind;

	opens com.technokid.WeatherDesktopApp to javafx.fxml;
	opens com.technokid.WeatherDesktopApp.API to com.fasterxml.jackson.databind;

	exports com.technokid.WeatherDesktopApp;
	exports com.technokid.WeatherDesktopApp.API;
}
