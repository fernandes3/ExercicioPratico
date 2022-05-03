/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class WhiteGoldPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("Palmito")){
            return new WhiteGoldStylePalmitoPizza();
        }else if(item.equals("Mista")){
            return new WhiteGoldStyleMistaPizza();
        }else if(item.equals("Frango Catupiry")){
            return new WhiteGoldStyleFrangoCatupiryPizza();
        }else if(item.equals("Caipira")){
             return new WhiteGoldStyleCaipiraPizza();
        }
        
        
        return null;
}
    
}
