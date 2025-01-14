package ToppingsDecorator;

import BasePizzaPackage.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza; //depicts the has-A relation with the BAsePizza

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 10;
    }
}
