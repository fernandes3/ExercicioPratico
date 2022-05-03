/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class LafayorkStyleBrigadeiroPizza extends Pizza{
    public LafayorkStyleBrigadeiroPizza() {
        name = "Chicago Style Brigadeiro Pizza";
        dough = "Massa selada";
        sauce = "Creme de chocolate";

        toppings.add("Chocolate Chocolate Granulado");
    }

    public void cut() {
        System.out.println("Cortando em quadrados bem pequenos");
    }

    public void bake() {
        System.out.println("20 minutos em 375 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa LafayorkPizzaStore oficial");
    }
}
