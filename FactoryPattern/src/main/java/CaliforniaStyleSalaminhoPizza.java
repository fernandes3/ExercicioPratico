/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class CaliforniaStyleSalaminhoPizza extends Pizza {
    public CaliforniaStyleSalaminhoPizza() {
        name = "Chicago Style Peperoni Pizza";
        dough = "Massa com borda de queijo cheddar";
        sauce = "Molho de tomate";

        toppings.add("Mussarela Salaminho Cebola Azeitona Oregano");
    }

    public void cut() {
        System.out.println("Cortando em pedaços diagonais");
    }

    public void bake() {
        System.out.println("20 minutos em 375 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa CaliforniaPizzaStore oficial com brinde pra criança");
    }
}
