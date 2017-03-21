package statePattern;

//TOD: PlayingMusic State must conform to the State interface
public class PlayingMusic implements State{

	protected int computeVampirePower() {
		return 42;
	}

	private void playMusic() {
		System.out.println("Play Music");
	}

	public PlayingMusic() {
		this.playMusic();
		this.entry();
	}
	
	@Override
	public void entry() {
		// startTimer();		
	}

	@Override
	public void exit() {
		
	}

	@Override
	public void handle(MusicPlayer player, Event event) {
		switch (event) {
		case PlayPausePressed:
			player.setCurrentState(new Paused());
			break;
		case OnOffPressed:
			break;
		case SleepTimeExceeded:
			player.setCurrentState(new Paused());
			break;
	}
		
	}
}
