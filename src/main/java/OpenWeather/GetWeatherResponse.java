package OpenWeather;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWeatherResponse {

	@Test
	public void WeatherOfLondon() {
		given().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk"
				+ "&appid=b6907d289e10d714a6e88b30761fae22")
		.then().statuscode(200);
	}
	
	
}
