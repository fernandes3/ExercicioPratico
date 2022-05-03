/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class LafayorkStyleLombinhoPizza extends Pizza {
    public LafayorkStyleLombinhoPizza() {
        name = "Chicago Style Lombinho Pizza";
        dough = "Massa crocante";
        sauce = "Molho de Tomate";

        toppings.add("Mussarela Lombinho Cebola Azeitona Oregano");
    }

    public void cut() {
        System.out.println("Cortando em triângulos");
    }

    public void bake() {
        System.out.println("20 minutos em 250 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa LafayorkPizzaStore oficial acompanhando brinde");
    }
}
