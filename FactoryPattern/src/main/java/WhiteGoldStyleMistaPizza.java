/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class WhiteGoldStyleMistaPizza extends Pizza {
      public WhiteGoldStyleMistaPizza() {
        name = "Chicago Style Mista Pizza";
        dough = "Massa crocante com borda de catupiry";
        sauce = "Molho de Tomate";

        toppings.add("Mussarela Presunto Azeitona Oregano");
    }

    public void cut() {
        System.out.println("Cortando em 12 pedaços");
    }

    public void bake() {
        System.out.println("20 minutos em 350 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa WhiteGoldPizzaStore com chaveiro de brinde");
    }
}
