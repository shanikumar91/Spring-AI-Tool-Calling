package com.spring.ai.firstproject;
import com.spring.ai.firstproject.tools.WeatherTool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjectApplicationTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    private WeatherTool weatherTool;

    @Test
    void getWeatherTool(){
        var response = weatherTool.getWeather("Noida");
        System.out.println(response);
    }
}
