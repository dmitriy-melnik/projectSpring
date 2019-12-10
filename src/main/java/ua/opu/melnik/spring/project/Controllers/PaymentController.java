package ua.opu.melnik.spring.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.opu.melnik.spring.project.Entities.Payment;
import ua.opu.melnik.spring.project.Services.PaymentService;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping("/payment")
    public List<Payment> getAllPayments() {
        return service.getAllPayments();
    }

    @PostMapping("/payment/{id_employee}")
    public void addPayment(@RequestBody Payment payment, @PathVariable(name = "id_employee") int id_employee) {

        service.addPayment(payment, id_employee);
    }
    
    /*
    @GetMapping("/payment_info")
    public Payment getPaymentById (@RequestParam(value = "payment_id") int paymentId) {
        return new Payment(paymentId, 1, 20, 18, 200, 18, 2, 10, 2019, 4500);
    }

    @PostMapping("/payment")
    public void ddPayment(@RequestBody Payment payment) {
        System.out.println(payment);
    }*/
}