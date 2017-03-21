package statePattern;

//TO: Paused State must conform to the State interface
public class Paused implements State{

	protected int computeVampirePower() {
		return 42;
	}

	private void pauseMusic() {
		System.out.println("Pause Music");
	}

	private void checkTimeout() {
		System.out.println("Check Timeout");
	}
	
	public Paused() {
		this.entry();
		this.pauseMusic();
		this.checkTimeout();
		this.computeVampirePower();		
	}

	@Override
	public void entry() {
		// setTimer()
		
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
