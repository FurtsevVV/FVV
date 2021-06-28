package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {

        return subscriptions.contains(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }


}
