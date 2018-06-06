package mediatorpattern;

import java.util.Date;

/**
 * 中介者
 *
 * @author Meer
 * @create 2018-06-06 21:22
 **/

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+user.getName()+message);
    }
}
