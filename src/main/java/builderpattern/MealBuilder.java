package builderpattern;

/**
 * 负责创建Meal对象
 *
 * @author Meer
 * @create 2017-10-24 13:35
 **/

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return  meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return  meal;
    }
}
