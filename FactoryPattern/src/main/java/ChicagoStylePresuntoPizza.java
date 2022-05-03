/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class ChicagoStylePresuntoPizza extends Pizza {
    
        public ChicagoStylePresuntoPizza() {
        name = "Chicago Style Presunto Pizza";
        dough = "Massa sem borda e crocante";
        sauce = "Molho de tomate com pimenta ";

        toppings.add("Presunto Calabresa");
    }

    public void cut() {
        System.out.println("Cortando em 4 pedaços");
    }

    public void bake() {
        System.out.println("20 minutos em 375 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa ChicagoPizzaStore oficial");
    }
    
}
