package ToppingsDecorator;

import BasePizzaPackage.BasePizza;

public class FreshPan extends ToppingDecorator{
    BasePizza basePizza; //depicts the has-A relation with the BAsePizza

    public FreshPan(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
