package commandPattern;

public class FlipUpCommand implements LightSwitchCommand {

	Light lamp;
	
	public FlipUpCommand(Light lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void execute() {
		lamp.turnOn();		
	}

}
