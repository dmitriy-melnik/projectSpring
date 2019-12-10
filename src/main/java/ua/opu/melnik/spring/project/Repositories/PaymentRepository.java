package ua.opu.melnik.spring.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.opu.melnik.spring.project.Entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {}
