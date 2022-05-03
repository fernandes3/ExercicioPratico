/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class LafayorkStyleTropicalPizza  extends Pizza{
    public LafayorkStyleTropicalPizza() {
        name = "Chicago Style Tropical Pizza";
        dough = "Massa crocante";
        sauce = "Molho de Tomate";

        toppings.add("Mussarela Presunto Palmito Milho Azeitona Oregano");
    }

    public void cut() {
        System.out.println("Cortando em 4 pedaços");
    }

    public void bake() {
        System.out.println("20 minutos em 300 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa LafayorkPizzaStore oficial com cupom de desconto na próxima compra");
    }
}
