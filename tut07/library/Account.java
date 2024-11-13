package PR2.tut07.library;

import PR2.tut5.Person;

public class Account {
    private int ID;
    private String password;
    private AccountStatus status;
    private Person person;
    private AccountType type;
    //Constructor
    public Account(int ID, String password, AccountStatus status, AccountType type) throws Exception {
        if (!this.isValidID(ID)) throw new Exception ("Invalid ID");
        this.ID = ID;

        if (!this.isValidPassword(password)) throw new Exception("Invalid password!");
        this.password = password;

        if (!this.isValidStatus(status)) throw new Exception("Invalid status!");
        this.status = status;

        if  (!this.isValidAccountType(type)) throw new Exception("Invalid account type!");
        this.type = type;
    }
    //getters & setters
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) throws Exception{
        if (!this.isValidID(ID)) throw new Exception ("Invalid ID!");
        this.ID = ID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) throws Exception {
        if (!this.isValidPassword(password)) throw new Exception("Invalid password!");
        this.password = password;
    }

    public AccountStatus getStatus() {
        return this.status;
    }

    public void setStatus(AccountStatus status) throws Exception{
        if (!this.isValidStatus(status)) throw new Exception("Invalid status!");
        this.status = status;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public AccountType getType() {
        return this.type;
    }

    public void setType(AccountType type) throws Exception{
        if  (!this.isValidAccountType(type)) throw new Exception("Invalid account type!");
        this.type = type;
    }

    //validators
    public boolean isValidID (int ID) {
        return ID >= 1;
    }

    public boolean isValidPassword (String password) {
        return (password.trim() != null) && (password.trim() != "") && (password.trim() != " ") && (password.trim().length() >= 8);
    }

    public boolean isValidStatus (AccountStatus status) {
        for (AccountStatus validStatus : AccountStatus.values()) {
            if (validStatus == status) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidAccountType (AccountType type) {
        for (AccountType validType : AccountType.values()) {
            if (validType == type) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account[ID=" + this.getID() + ",password=" + this.getPassword() + ",status=" + this.getStatus() + ",account type=" + this.getType() + "]";
    }
}
