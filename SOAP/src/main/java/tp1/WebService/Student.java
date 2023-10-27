package tp1.WebService;

import java.util.Date;

public class Student {
    private long id;
    private String Name;
    private String cin;
    private Date Birth;
    private String filiere;

    public Student() {
    }

    public Student(long id, String name, String cin, Date birth, String filiere) {
        this.id = id;
        Name = name;
        this.cin = cin;
        Birth = birth;
        this.filiere = filiere;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date birth) {
        Birth = birth;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
