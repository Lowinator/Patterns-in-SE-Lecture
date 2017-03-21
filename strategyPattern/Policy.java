package strategyPattern;

public class Policy {

	// TOD: add the missing attribute
	Context context;
	
	public Policy(Context context) {
		// set the context
		this.context = context;
	}

	public void configure(boolean timeIsImportant, boolean spaceIsImportant) {
		if (timeIsImportant && spaceIsImportant)
			context.selectStrategy(new QuickSort());
		else if (timeIsImportant && !spaceIsImportant)
			context.selectStrategy(new MergeSort());
			
			
	}
}
