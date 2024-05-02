package com.example.demo;


import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;



@Entity(name="student")
@Table(name="student",
uniqueConstraints = {
        @UniqueConstraint(name="student_email_unique",columnNames="email")
})
public class Student {

    @Id
    @SequenceGenerator(
            name="studentSequence",
            sequenceName = "studentSequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "studentSequence"
    )
    @Column(
            name = "id" ,
            updatable = false
    )
    private long id;
    @Column(
            name="first_name",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String firstname;
    @Column(
            name="last_name",
            nullable = false,
            columnDefinition = "TEXT"


    )
    private String lastname;
    @Column(
            name="email",
            nullable = false,
            columnDefinition = "TEXT"


    )
    private String email;
    @Column(name="age",
     nullable=false)
    private Integer age;


    public Student( String firstname, String lastname, String email, Integer age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }


    public Student() {


    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
