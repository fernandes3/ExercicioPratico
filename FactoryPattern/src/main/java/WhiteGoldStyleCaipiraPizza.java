/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class WhiteGoldStyleCaipiraPizza  extends Pizza{
    
           public WhiteGoldStyleCaipiraPizza() {
        name = "Chicago Style Caipira Pizza";
        dough = "Massa crocante com borda de queijo cheddar";
        sauce = "Molho de Tomate";

        toppings.add("FrangoDesfiado Milho Ervilha Mussarela Oregano Azeitona");
    }

    public void cut() {
        System.out.println("Cortando em 8 pedaços");
    }

    public void bake() {
        System.out.println("15 minutos em 350 graus");
    }

    public void box() {
        System.out.println("Colocando na caixa WhiteGoldPizzaStore com chaveiro de brinde");
    }
    
}
