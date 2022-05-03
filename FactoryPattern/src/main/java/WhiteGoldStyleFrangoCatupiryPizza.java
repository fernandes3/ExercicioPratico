/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class WhiteGoldStyleFrangoCatupiryPizza extends Pizza {
       public WhiteGoldStyleFrangoCatupiryPizza() {
        name = "Chicago Style Frago com Catupiry Pizza";
        dough = "Massa crocante com borda de queijo cheddar";
        sauce = "Molho de Tomate";

        toppings.add("Mussarela Frango Milho Bacon Catupiry Oregano Azeitona");
    }

    public void cut() {
        System.out.println("Cortando em 4 pedaços");
    }

    public void bake() {
        System.out.println("15 minutos em 350 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa WhiteGoldPizzaStore com chaveiro de brinde");
    }
}
