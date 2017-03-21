package command;

import model.TemperatureModel;
import start.IllegalTemperatureException;

public class LowerKCommand extends Command {
	
	public LowerKCommand(TemperatureModel model) {
		this.model = model;
	}
	@Override
	public void execute() throws IllegalTemperatureException {
		model.setK(model.getK()-1);
	}

	@Override
	public void redo() throws IllegalTemperatureException {
		model.setK(model.getK()-1);
	}

	@Override
	public void undo() throws IllegalTemperatureException {
		model.setK(model.getK()+1);
	}

}
