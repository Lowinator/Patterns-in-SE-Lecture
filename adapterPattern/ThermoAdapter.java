package adapterPattern;

public class ThermoAdapter implements ThermoInterface {

	private FahrenheitThermo thermo;
	
	public ThermoAdapter() {
		thermo = new FahrenheitThermo();
	}
	
	@Override
	public double getTempC() {		
		return (thermo.getFarenheitTemperature() - 32.0) * (5.0/9.0);
	}

}
