package mediatorpattern;

/**
 * @author Meer
 * @create 2018-06-06 21:24
 **/

public class User {
    private String name;

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
