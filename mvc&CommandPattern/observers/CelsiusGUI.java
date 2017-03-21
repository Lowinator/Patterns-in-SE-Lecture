package observers;
 

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import start.Controller;
import model.TemperatureModel;

public class CelsiusGUI extends TemperatureGUI {

	private Controller controller;
	
	public CelsiusGUI(Controller controller, Point location) {
		super("Celsius Temperature", location);
		this.controller = controller;
		addRaiseTempListener(new RaiseTempListener());
		addLowerTempListener(new LowerTempListener());
		addDisplayListener(new DisplayListener());
	}

	public void update(Observable t, Object o) { // Called from the Model
		setDisplay("" + ((TemperatureModel) t).getC());
	}

	class RaiseTempListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			controller.increaseC();
		}
	}

	class LowerTempListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			controller.decreaseC();
		}
	}

	class DisplayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double value = getDisplay();
			controller.setC(value);
		}
	}
}