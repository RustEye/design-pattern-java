package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/23.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice == null) {
            return null;
        } else if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return  new ColorFactory();
        }
        return null;
    }
}
