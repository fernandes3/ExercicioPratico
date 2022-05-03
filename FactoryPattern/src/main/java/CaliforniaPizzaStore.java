/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("6 Queijos")){
            return new CaliforniaStyle6QueijosPizza();
        }else if(item.equals("Peperoni")){
            return new CaliforniaStylePeperoniPizza();
        }else if(item.equals("Salaminho")){
            return new CaliforniaStyleSalaminhoPizza();
        }else if(item.equals("Siciliana")){
             return new CaliforniaStyleSicilianaPizza();
        }
        
        
        return null;
}
    
}