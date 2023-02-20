public class App { public static void main(String[] args){
    NYPizzaStore nystore = new NYPizzaStore();
    ChicagoPizzaStore chicagostore = new ChicagoPizzaStore();
    
    
    pizza pizza = nystore.orderPizza("cheese");
    System.out.println("Orden de Abraham: " + pizza.getName() + "\n");
    
    pizza = chicagostore.orderPizza("pepperoni");
    System.out.println("Orden de Jhoana: " + pizza.getName() + "\n");
}
}
