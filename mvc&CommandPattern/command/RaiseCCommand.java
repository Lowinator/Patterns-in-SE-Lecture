package command;

import model.TemperatureModel;
import start.IllegalTemperatureException;

public class RaiseCCommand extends Command {
	
	public RaiseCCommand(TemperatureModel model) {
		this.model = model;
	}
	@Override
	public void execute() throws IllegalTemperatureException {
		model.setC(model.getC()+1);
	}

	@Override
	public void redo() throws IllegalTemperatureException {
		model.setC(model.getC()+1);
	}

	@Override
	public void undo() throws IllegalTemperatureException {
		model.setC(model.getC()-1);
	}

}
