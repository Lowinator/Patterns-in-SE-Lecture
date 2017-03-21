package commandPattern;

public class Switch {
	
	LightSwitchCommand up;
	LightSwitchCommand down;
	
	public Switch(LightSwitchCommand up, LightSwitchCommand down) {
		this.up = up;
		this.down = down;
	}
	
	public void flipUp() {
		up.execute();
		
	}

	public void flipDown() {
		down.execute();
	}
	

}
