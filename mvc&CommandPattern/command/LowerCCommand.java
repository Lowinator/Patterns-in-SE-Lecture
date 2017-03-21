package command;

import model.TemperatureModel;
import start.IllegalTemperatureException;

public class LowerCCommand extends Command {
	
	public LowerCCommand(TemperatureModel model) {
		this.model = model;
	}

	public void execute() throws IllegalTemperatureException {
		model.setC(model.getC()-1);
	}

	public void redo() throws IllegalTemperatureException {
		model.setC(model.getC()-1);
	}

	public void undo() throws IllegalTemperatureException {
		model.setC(model.getC()+1);
	}
}
