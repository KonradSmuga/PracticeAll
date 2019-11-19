package weather.stub;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherForecastTest {

    @Test
    public void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(4, quantityOfSensors);
    }
}

