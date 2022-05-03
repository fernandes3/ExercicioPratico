/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class NYStyleQueijoPizza extends Pizza {

    public NYStyleQueijoPizza() {
        name = "NY Style Pizza de Queijo";
        dough = "Massa sem borda";
        sauce = "Molho de Tomate";

        toppings.add("Cebola roxa e queijo ralado");

    }

    public void cut() {
        System.out.println("Cortando a pizza em 4 pedaços");
    }
    
    public void bake(){
        System.out.println("15 minutos em 250 graus");
    }
    
    public void box(){
         System.out.println("Colocando na caixa NYPizzaStore oficial");
    }

}
