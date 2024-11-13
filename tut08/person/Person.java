package PR2.tut08.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;
    //Constructor
    public Person() {
    }

    public Person (int id, String name, String dateOfBirth) throws Exception {
        if (!this.isValidID(id)) throw new Exception("Invalid ID!");
        this.id = id;

        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;

        if (!this.isValidDateOfBirth(dateOfBirth)) throw new Exception("Invalid date of birth!");
        this.dateOfBirth = dateOfBirth;
    }

    public Person (int id, String name, String dateOfBirth, String email, String tel, String address) throws Exception{
        if (!this.isValidID(id)) throw new Exception("Invalid ID!");
        this.id = id;

        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;

        if (!this.isValidDateOfBirth(dateOfBirth)) throw new Exception("Invalid date of birth!");
        this.dateOfBirth = dateOfBirth;

        if (!this.isValidEmail(email)) throw new Exception("Invalid email!");
        this.email = email;

        if (!this.isValidTel(tel)) throw new Exception("Invalid telephone number!");
        this.tel = tel;

        if (!this.isValidAddress(address)) throw new Exception("Invalid address");
        this.address = address;
    }
    //getter & setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) throws Exception {
        if (!this.isValidID(id)) throw new Exception("Invalid ID!");
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws Exception {
        if (!this.isValidDateOfBirth(dateOfBirth)) throw new Exception("Invalid date of birth!");
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email)throws Exception {
        if (!this.isValidEmail(email)) throw new Exception("Invalid email!");
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) throws Exception {
        if (!this.isValidTel(tel)) throw new Exception("Invalid telephone number!");
        this.tel = tel;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address)throws Exception{
        if (!this.isValidAddress(address)) throw new Exception("Invalid address");
        this.address = address;
    }

    //validator
    public boolean isValidID (int id) {
        return id > 0;
    }

    public boolean isValidName (String name) {
        return name != null & name != " " & name != "";
    }

    public boolean isValidDateOfBirth (String dateOfBirth) {
        return dateOfBirth.trim().length() <= 10 && dateOfBirth != null && dateOfBirth != "" && dateOfBirth != " ";
    }

    public boolean isValidEmail (String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidTel (String tel) {
        String phoneRegex = "^(\\+?84|0)\\d{9}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(tel);
        return matcher.matches();
    }

    public boolean isValidAddress (String address) {
        return address != null && address != "" && address != " " && address.trim().length() <= 100;
    }

    public boolean repOK () {
        return this.isValidID(this.getId()) && this.isValidName(this.getName()) && this.isValidDateOfBirth(this.getDateOfBirth()) && this.isValidEmail(this.getEmail()) && this.isValidTel(this.getTel()) && this.isValidAddress(this.getAddress());
    }

    @Override
    public String toString() {
        return "Person[" +
                "id=" + this.getId() +
                ",name=" + this.getName() +
                ",dateOfBirth=" + this.getDateOfBirth() +
                ",email=" + this.getEmail() +
                ",tel=" + this.getTel() +
                ",address=" + this.getAddress() +
                "]";
    }
}

