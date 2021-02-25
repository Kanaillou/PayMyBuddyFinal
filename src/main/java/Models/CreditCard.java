package Models;

import java.util.List;

public class CreditCard {

    private long id;
    private String nameCard;

    private List<Account> listAccounts;


    public CreditCard(long id, String nameCard, List<Account> listAccounts) {
        this.id = id;
        this.nameCard = nameCard;
        this.listAccounts = listAccounts;
    }

    public List<Account> getListAccounts() {
        return listAccounts;
    }

    public void setListAccounts(List<Account> listAccounts) {
        this.listAccounts = listAccounts;
    }

    public long getId() {
        return id;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }
}
