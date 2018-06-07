package templatepattern;

/**
 * @author Meer
 * @create 2018-06-07 21:42
 **/

public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
