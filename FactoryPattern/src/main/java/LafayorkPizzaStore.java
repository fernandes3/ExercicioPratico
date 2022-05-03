/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class LafayorkPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("Brigadeiro")){
            return new LafayorkStyleBrigadeiroPizza();
        }else if(item.equals("Tropical")){
            return new LafayorkStyleTropicalPizza();
        }else if(item.equals("Moda")){
            return new LafayorkStyleModaPizza();
        }else if(item.equals("Lombinho")){
             return new LafayorkStyleLombinhoPizza();
        }
        
        
        return null;
    }
}
