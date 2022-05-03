/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class ChicagoStyleQueijoPizza extends Pizza {
    public ChicagoStyleQueijoPizza () {
		name="Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarela Cheese");
	}
	public void cut () {
		System.out.println("Cortando em pedaços");
	}

}
