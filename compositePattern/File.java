package compositePattern;

public class File extends FileSystemObject  {
	
	//TOD: add the missing inheritance

	public File(String name) {
		super(name);
	}

	@Override
	public void list(int level) {
		printName(level);
	}

}
