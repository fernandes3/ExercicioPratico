/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class ChicagoPizzaStore extends PizzaStore{
@Override
    protected Pizza createPizza(String item) {
        if(item.equals("Queijo")){
            return new ChicagoStyleQueijoPizza();
        }else if(item.equals("Marguerita")){
            return new ChicagoStyleMargueritaPizza();
        }else if(item.equals("Atum")){
            return new ChicagoStyleAtumPizza();
        }else if(item.equals("Presunto")){
             return new ChicagoStylePresuntoPizza();
        }
        
        
        return null;
    }
}
