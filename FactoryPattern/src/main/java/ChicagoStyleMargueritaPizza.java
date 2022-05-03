/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class ChicagoStyleMargueritaPizza extends Pizza {

    public ChicagoStyleMargueritaPizza() {
        name = "Chicago Style Marguerita Pizza";
        dough = "Massa com borda de catupiry";
        sauce = "Molho de tomate";

        toppings.add("Manjericão Mussarela");
    }

    public void cut() {
        System.out.println("Cortando em quadrados bem pequenos");
    }

    public void bake() {
        System.out.println("20 minutos em 375 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa ChicagoPizzaStore oficial");
    }
}
