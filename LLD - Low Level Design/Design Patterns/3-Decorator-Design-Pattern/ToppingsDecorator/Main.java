package ToppingsDecorator;

import BasePizzaPackage.BasePizza;
import BasePizzaPackage.FarmHouse;
import BasePizzaPackage.Margherita;
import BasePizzaPackage.VegDelight;

public class Main {
    public static void main(String[] args) {
        /**Suppose we want the cost of
         * Margherita and toppings as ExtraCheese + FreshPan
         **/

        BasePizza pizza = new FreshPan(new ExtraCheese(new Margherita()));
        //wrapping veg delight into another toppings freshpan and treating both of wrapped as a single object
        BasePizza pizza2 = new FreshPan(new VegDelight());

        BasePizza pizza3 = new Mushroom(new ExtraCheese(new VegDelight())); //Vegdelight + Extracheese + mushroom

        System.out.println("Cost of margherita and cheese and freshpan : " + pizza.cost());
        System.out.println("Cost of Veg-Delight + freshpan : " + pizza2.cost());

    }
}
