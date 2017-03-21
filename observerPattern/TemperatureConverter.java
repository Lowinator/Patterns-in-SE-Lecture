package observerPattern;

import java.awt.Point;


//TOD create KelvinGUI class
//TOD Add methods in TemperatureModel class

public class TemperatureConverter {

	public static void main(String args[]) {
		TemperatureModel temperature = new TemperatureModel();
		
		FahrenheitGUI fahrenheitGUI = new FahrenheitGUI(temperature, new Point(100, 100));
		fahrenheitGUI.show();
		
		CelsiusGUI celsiusGUI = new CelsiusGUI(temperature, new Point(100, 250));
		celsiusGUI.show();
		
		SliderGUI sliderGUI = new SliderGUI(temperature, new Point(20, 100));
		sliderGUI.show();
		
		GaugeGUI gaugeGUI = new GaugeGUI(temperature, new Point(200, 200));
		gaugeGUI.setVisible(true);
		
		KelvinGUI kelvinGUI = new KelvinGUI(temperature, new Point(100, 300));
		kelvinGUI.show();
		
		
		//TOD: instantiate the Kelvin view
	}
}
