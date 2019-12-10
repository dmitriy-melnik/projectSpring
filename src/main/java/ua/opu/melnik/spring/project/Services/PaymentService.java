package ua.opu.melnik.spring.project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.opu.melnik.spring.project.Entities.Employee;
import ua.opu.melnik.spring.project.Entities.Payment;
import ua.opu.melnik.spring.project.Repositories.EmployeeRepository;
import ua.opu.melnik.spring.project.Repositories.PaymentRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    @Autowired
    private EmployeeRepository employeeRepo;

    public void addPayment(Payment payment, int id) {
        Employee e = employeeRepo.getOne(id);
        payment.setEmployee(e);
        paymentRepo.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepo.findAll();
    }
}
