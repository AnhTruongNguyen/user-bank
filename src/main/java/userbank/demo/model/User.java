package userbank.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "/users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private boolean gender;
    @OneToMany(mappedBy = "user")

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
