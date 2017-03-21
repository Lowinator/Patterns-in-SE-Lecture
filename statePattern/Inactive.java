package statePattern;
//TOD: On State must conform to the State interface
public class Inactive implements State {
	
	protected int computeVampirePower() {
		return 42;
	}
	
	private void LEDOff() {
		System.out.println("LED turned Off.");
	}
	
	public Inactive() {
		this.entry();
	}

	@Override
	public void entry() {
		LEDOff();
		
	}

	@Override
	public void exit() {
		
	}

	@Override
	public void handle(MusicPlayer player, Event event) {
		switch (event) {
			case PlayPausePressed:
				break;
			case OnOffPressed:
				player.setCurrentState(new On());
				break;
			case SleepTimeExceeded:
				break;
		}
		
	}
}