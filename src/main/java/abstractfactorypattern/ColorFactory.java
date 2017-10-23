package abstractfactorypattern;

/**
 * Created by Meer on 2017/10/23.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }else if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if(color.equalsIgnoreCase("green")){
            return new Green();
        }else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
