/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbassignment;


public class MadinetNasrPizzaIngredientFactory implements pizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Chicken createChicken() {
        return new FriedChicken();
    }
    
}
