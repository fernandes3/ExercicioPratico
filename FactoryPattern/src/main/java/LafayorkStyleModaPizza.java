/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class LafayorkStyleModaPizza extends Pizza {
    public LafayorkStyleModaPizza() {
        name = "Chicago Style A Moda Pizza";
        dough = "Massa macia";
        sauce = "Molho de Tomate";

        toppings.add("Presunto Mussarela Lombinho Bacon Milho Azeitona Oregano");
    }

    public void cut() {
        System.out.println("Cortando em quadrados bem pequenos");
    }

    public void bake() {
        System.out.println("20 minutos em 300 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa LafayorkPizzaStore oficial com cupom de desconto na próxima compra");
    }
}
