package ToppingsDecorator;

import BasePizzaPackage.BasePizza;

public class Mushroom extends ToppingDecorator{
     BasePizza basePizza; //depicts the has-A relation with the BAsePizza

     public Mushroom(BasePizza basePizza){
         this.basePizza = basePizza;
     }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
