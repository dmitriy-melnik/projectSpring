package ua.opu.melnik.spring.project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "id_employee", nullable = false)
    @JsonIgnore
    private Employee employee;

    @Column(name = "norm_of_working_days")
    private int normOfWorkingDays;

    @Column(name = "amount_of_working_days")
    private int amountOfWorkingDays;

    @Column(name = "premium")
    private double premium;

    @Column(name = "income_tax")
    private double income_tax;

    @Column(name = "military_tax")
    private double military_tax;

    @Column(name = "month")
    private int month;

    @Column(name = "year")
    private int year;

    @Column(name = "total")
    private double total;

    public Payment(int id, Employee employee, int normOfWorkingDays, int amountOfWorkingDays, double premium, double income_tax, double military_tax, int month, int year, double total) {
        this.id = id;
        this.employee = employee;
        this.normOfWorkingDays = normOfWorkingDays;
        this.amountOfWorkingDays = amountOfWorkingDays;
        this.premium = premium;
        this.income_tax = income_tax;
        this.military_tax = military_tax;
        this.month = month;
        this.year = year;
        this.total = total;
    }

    public Payment() {}
}
