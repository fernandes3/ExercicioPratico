/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class NYStylePortuguesaPizza extends Pizza{
    public NYStylePortuguesaPizza() {
        name = "NY Style Pizza Portuguesa";
        dough = "Massa sem borda";
        sauce = "Molho de Tomate e Azeite";

        toppings.add("Oregano Pimenta");

    }

    public void cut() {
        System.out.println("Cortando a pizza em pedaços diagonais");
    }
    
    public void bake(){
        System.out.println("30 minutos em 250 graus");
    }
    
    public void box(){
         System.out.println("Colocando na caixa NYPizzaStore oficial");
    }

}
