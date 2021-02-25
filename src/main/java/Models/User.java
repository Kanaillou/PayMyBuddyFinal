package Models;

import java.util.List;

public class User {

    private long userId;
    private String password;
    private String firstName;
    private String lastName;
    private String email; //unique

    private List<User> list_friends;
    private List<Account> list_account;

    public User(long userId, String password, String firstName, String lastName, String email, List<User> list_friends, List<Account> list_account) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.list_friends = list_friends;
        this.list_account = list_account;
    }

    public List<Account> getList_account() {
        return list_account;
    }

    public void setList_account(List<Account> list_account) {
        this.list_account = list_account;
    }

    public List<User> getList_friends() {
        return list_friends;
    }

    public void setList_friends(List<User> list_friends) {
        this.list_friends = list_friends;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


