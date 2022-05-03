/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class ChicagoStyleAtumPizza extends Pizza {
        public ChicagoStyleAtumPizza() {
        name = "Chicago Style Atum Pizza";
        dough = "Massa crocante";
        sauce = "Molho de tomate com frango desfiado ";

        toppings.add("Atum Queijo Mussarela");
    }

    public void cut() {
        System.out.println("Cortando em 12 pedaços");
    }

    public void bake() {
        System.out.println("20 minutos em 375 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa ChicagoPizzaStore oficial e adicionando um brinde");
    }
    
}
