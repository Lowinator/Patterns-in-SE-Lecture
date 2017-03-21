package statePattern;

//TOD: On State must conform to the State interface
public class On implements State{

	protected int computeVampirePower() {
		return 42;
	}

	private void LEDOn() {
		System.out.println("LED turned On.");
	}

	@Override
	public void entry() {
		LEDOn();
		
	}
	
	public On() {
		this.entry();
		this.computeVampirePower();
	}

	@Override
	public void exit() {
		
	}

	@Override
	public void handle(MusicPlayer player, Event event) {
		switch (event) {
		case PlayPausePressed:
			player.setCurrentState(new PlayingMusic());
			break;
		case OnOffPressed:
			player.setCurrentState(new Inactive());
			break;
		case SleepTimeExceeded:
			player.setCurrentState(new Inactive());
			break;
		}
		
		this.exit();		
	}

}
