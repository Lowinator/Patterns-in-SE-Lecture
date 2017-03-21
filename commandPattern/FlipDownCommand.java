package commandPattern;

public class FlipDownCommand implements LightSwitchCommand {

	Light lamp;
	
	public FlipDownCommand(Light lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void execute() {
		lamp.turnOff();		
	}

}
