/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("Queijo")){
            return new NYStyleQueijoPizza();
        }else if(item.equals("Vegana")){
            return new NYStyleVeganaPizza();
        }else if(item.equals("4 Queijos")){
            return new NYStyle4QueijosPizza();
        }else if(item.equals("Portuguesa")){
             return new NYStylePortuguesaPizza();
        }
        
        
        return null;
        
          
    }
    
    
    
}
