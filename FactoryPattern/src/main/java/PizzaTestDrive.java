/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();
        PizzaStore lafayorkStore = new LafayorkPizzaStore();
        PizzaStore whiteStore = new WhiteGoldPizzaStore();
        Pizza pizza = nyStore.orderPizza("Portuguesa");
        System.out.println("Você comprou uma " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("Presunto");
        System.out.println("Agora você comprou uma " + pizza.getName() + "\n");
        pizza = californiaStore.orderPizza("Peperoni");
        System.out.println("Agora você comprou uma " + pizza.getName() + "\n");
        pizza = lafayorkStore.orderPizza("Brigadeiro");
        System.out.println("Agora você comprou uma " + pizza.getName() + "\n");
        pizza = whiteStore.orderPizza("Caipira");
        System.out.println("Agora você comprou uma " + pizza.getName() + "\n");
    }

}
