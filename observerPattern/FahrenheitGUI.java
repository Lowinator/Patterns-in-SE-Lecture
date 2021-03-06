package observerPattern;


import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;


public class FahrenheitGUI extends TemperatureGUI {
	
	public FahrenheitGUI(TemperatureModel model, Point location) {
		super("Fahrenheit Temperature", model, location);
		setDisplay("" + model.getF());
		addRaiseTempListener(new RaiseTempListener());
		addLowerTempListener(new LowerTempListener());
		addDisplayListener(new DisplayListener());
	}

	public void update(Observable t, Object o) { // Called from the Model
		setDisplay("" + getModel().getF());
	}

	class RaiseTempListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getModel().setF(getModel().getF() + 1.0);
		}
	}

	class LowerTempListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getModel().setF(getModel().getF() - 1.0);
		}
	}

	class DisplayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double value = getDisplay();
			getModel().setF(value);
		}
	}
}
