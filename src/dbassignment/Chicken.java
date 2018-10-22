/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbassignment;

/**
 *
 * @author karimm7mad
 */
abstract class Chicken {

    public String name;

}

class FriedChicken extends Chicken {


    public FriedChicken() {
        this.name = "FriedChicken";
    }
}

class GrilledChicken extends Chicken {


    public GrilledChicken() {
        this.name = "GrilledChicken";
    }
}
