package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Directory extends FileSystemObject {

	
	//TOD: add the missing inheritance
	//TOD: add the missing field
	//TOD: add the missing methods
	
	List<FileSystemObject> children = new LinkedList<>();

	public Directory(String name) {
		super(name);
	}
	
	public void addChild(FileSystemObject child) {
		children.add(child);
	}
	
	public void removeChild(FileSystemObject child) {
		children.remove(child);
	}
	
	public List<FileSystemObject> getChildren() {
		return children;		
	}
	
	

	@Override
	public void list(int level) {
		printName(level);

		Iterator<FileSystemObject> iterator = children.iterator();
		while (iterator.hasNext()) {
			FileSystemObject child = (FileSystemObject) iterator.next();
			child.list(level + 1);
		}
	}



}
