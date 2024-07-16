package com.example.eshopee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eshopee.entites.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
