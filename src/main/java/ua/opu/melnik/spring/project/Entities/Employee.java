package ua.opu.melnik.spring.project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "id_position", nullable = false)
    @JsonIgnore
    private Position position;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "code_id")
    private String codeID;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Payment> payments;

    public Employee(Position position, String lastName, String firstName, String patronymic, String codeID, String phone, List<Payment> payments) {
        this.position = position;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.codeID = codeID;
        this.phone = phone;
        this.payments = payments;
    }

    public Employee() {}
}
