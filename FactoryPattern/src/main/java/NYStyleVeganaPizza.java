/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class NYStyleVeganaPizza extends Pizza{
     public NYStyleVeganaPizza() {
        name = "NY Style Pizza Vegana";
        dough = "Massa com borda";
        sauce = "Molho de Tomate e pitadas de azeite";

        toppings.add("Cebola roxa");

    }

    public void cut() {
        System.out.println("Cortando a pizza em 8 pedaços");
    }
    
    public void bake(){
        System.out.println("10 minutos em 250 graus");
    }
    
    public void box(){
         System.out.println("Colocando na caixa NYPizzaStore oficial");
    }
}
