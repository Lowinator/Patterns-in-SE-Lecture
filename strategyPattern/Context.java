package strategyPattern;

public class Context {
	int[] array;
	SortStrategy strategy;
	
	public void setArray(int[] array) {
		this.array = array;
	}
	
	public void selectStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void sort() {
		strategy.performSort(array);
	}
	
	
}
