package builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单
 *
 * @author Meer
 * @create 2017-10-24 13:30
 **/

public class Meal {
    private List<Item> items = new ArrayList<>();

    public  void  addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;

        for(Item item: items){
            cost += item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item: items){
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.packing().pack());
            System.out.println(",Price:"+item.price());
        }
    }
}
