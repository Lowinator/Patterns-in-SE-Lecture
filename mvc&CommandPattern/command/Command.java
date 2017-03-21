package command;

import start.IllegalTemperatureException;
import model.TemperatureModel;

/**
 * Represents an abstract TemperatureConverter command.
 * All commands shall extend this class.
 */
public abstract class Command {

	/**
	 * Reference to the model.
	 */
	protected TemperatureModel model;

	/**
	 * Execute the command.
	 * @throws IllegalTemperatureException 
	 */
	public abstract void execute() throws IllegalTemperatureException;

	/**
	 * Undo the command.
	 * @throws IllegalTemperatureException 
	 */
	public abstract void undo() throws IllegalTemperatureException;

	/**
	 * Redo the command.
	 * @throws IllegalTemperatureException 
	 */
	public abstract void redo() throws IllegalTemperatureException;
}

