package weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        stubResult.put(0, 24.5);
        stubResult.put(1, 25.5);
        stubResult.put(2, 26.5);
        stubResult.put(3, 27.5);

        return stubResult;
    }
}
