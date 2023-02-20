
public abstract class pizzaStore {
    
	abstract pizza createPizza(String item);
    
	public pizza orderPizza(String type) {
		pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
