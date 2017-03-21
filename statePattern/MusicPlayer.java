package statePattern;

public class MusicPlayer {

	private State currentState;

	public MusicPlayer() {
		// TOD: Set initial state to Inactive State
		currentState = new Inactive();
	}

	public void setCurrentState(State currentState) {
		if (this.currentState != null) {
			this.currentState.exit();
		}
		this.currentState = currentState;
		this.currentState.entry();
	}

	public State getCurrentState() {
		return currentState;
	}

	public void handle(Event event) {
		// TOD: Handle State specific behavior here.
		this.getCurrentState().handle(this, event);
	}

	public void playMusic() {
		System.out.println("Playing Music");
	}

	public void pauseMusic() {
		System.out.println("Pausing the Music");
	}

	public void turnOn() {
		System.out.println("Music Player turned On");
	}

	public void turnOff() {
		System.out.println("Music Player turned Off");
	}
}
