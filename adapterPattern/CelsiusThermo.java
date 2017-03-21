package adapterPattern;

public class CelsiusThermo implements ThermoInterface {

	public double getTempC() {
		throw new IllegalStateException("Someone steped on the Celcius Thermometer. It is not working :(");
	}

}
