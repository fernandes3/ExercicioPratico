/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class CaliforniaStyleSicilianaPizza  extends Pizza{
       public CaliforniaStyleSicilianaPizza() {
        name = "Chicago Style Siciliana Pizza";
        dough = "Massa com borda de queijo cheddar";
        sauce = "Molho de tomate";

        toppings.add("Mussarela Bacon Champignon Azeitona Oregano");
    }

    public void cut() {
        System.out.println("Cortando em pedaços diagonais");
    }

    public void bake() {
        System.out.println("30 minutos em 375 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa CaliforniaPizzaStore oficial");
    }
}
