
package cn.techtutorial.ctb.user.model;

import cn.techtutorial.ctb.admin.model.Person;

public class User extends Person{
    private int id;
    private String email;
    private String password;
    
    public User(){}

    public User(int id, String email, String password, String name, String gender, String dob) {
        super(name, gender, dob);
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String name, String gender, String dob) {
        super(name, gender, dob);
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
    
    
    
}
