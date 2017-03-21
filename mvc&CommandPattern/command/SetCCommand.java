package command;

import model.TemperatureModel;
import start.IllegalTemperatureException;

public class SetCCommand extends Command {
	private double oldValue;
	private double newValue = -9999;
	
	public SetCCommand(TemperatureModel model) {
		this.model = model;
		oldValue = model.getC();
	}
	@Override
	public void execute() throws IllegalTemperatureException {
		model.setC(newValue);
	}

	@Override
	public void redo() throws IllegalTemperatureException {
		model.setC(newValue);
	}

	@Override
	public void undo() throws IllegalTemperatureException {
		model.setC(oldValue);
	}
	
	public void setCTemperature(double cTemp) {
		newValue = cTemp;
	}
}