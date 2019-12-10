package ua.opu.melnik.spring.project.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "position")
@Data
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "position")
    private String position;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "salary")
    private double salary;

    @Column(name = "prepayment")
    private double prepayment;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Position(String position, String faculty, double salary, double prepayment, List<Employee> employees) {
        this.position = position;
        this.faculty = faculty;
        this.salary = salary;
        this.prepayment = prepayment;
        this.employees = employees;
    }

    public Position(){}
}