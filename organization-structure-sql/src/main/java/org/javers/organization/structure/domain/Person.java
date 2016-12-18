package org.javers.organization.structure.domain;

import javax.persistence.*;

@Entity
@Table
public class Person {

    @Id
    @SequenceGenerator(name="person_sequence", sequenceName="person_sequence", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="person_sequence") //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private Sex sex;
    private Integer salary;
    private Position position;

    @OneToOne(mappedBy = "person")
    Employee employee;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, Sex sex, Integer salary, Position position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

