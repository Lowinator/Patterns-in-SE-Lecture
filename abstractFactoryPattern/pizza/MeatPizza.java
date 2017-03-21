package de.tum.cs.i1.pse.factory.pizza;

import de.tum.cs.i1.pse.factory.toppingfactory.PizzaToppingFactory;

public class MeatPizza extends Pizza{

	PizzaToppingFactory ingredientFactory;
	 
	public MeatPizza(PizzaToppingFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		meat = ingredientFactory.createMeat();
	}

}
