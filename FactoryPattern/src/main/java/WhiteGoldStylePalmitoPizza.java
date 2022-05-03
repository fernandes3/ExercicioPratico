/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class WhiteGoldStylePalmitoPizza extends Pizza {
    public WhiteGoldStylePalmitoPizza() {
        name = "Chicago Style Palmito Pizza";
        dough = "Massa crocante";
        sauce = "Molho de Tomate";

        toppings.add("Mussarela Palmito Oregano");
    }

    public void cut() {
        System.out.println("Cortando em 10 pedaços");
    }

    public void bake() {
        System.out.println("20 minutos em 350 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa WhiteGoldPizzaStore");
    }
}
