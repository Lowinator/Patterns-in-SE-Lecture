package statePattern;

public interface State {
	
	public void entry();
	public void exit();
	public void handle(MusicPlayer player, Event event);	
}
