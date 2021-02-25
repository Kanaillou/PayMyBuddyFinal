package org.example.paymybuddy.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    //@JsonIgnore
    @OneToMany
  /*  @JoinTable(name = "user_contacts",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "contact_id", referencedColumnName = "id")
    )*/
    private List<User> list_friends;

    @OneToMany
//    @JoinTable(name = "user_accounts",
//            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id")
//    )
    private List<Account> list_account;

    public User(long id, String password, String firstName, String lastName, String email, List<User> list_friends, List<Account> list_account) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


