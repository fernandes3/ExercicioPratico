/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class NYStyle4QueijosPizza extends Pizza {

    public NYStyle4QueijosPizza() {
        name = "NY Style Pizza de 4 Queijos";
        dough = "Massa com borda de queijo cheddar";
        sauce = "Molho de tomate e parmesão";

        toppings.add("Cebola roxa azeitona preta e queijo ralado");

    }

    public void cut() {
        System.out.println("Cortando a pizza em 8 pedaços");
    }

    public void bake() {
        System.out.println("15 minutos em 350 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa NYPizzaStore oficial");
    }
}
