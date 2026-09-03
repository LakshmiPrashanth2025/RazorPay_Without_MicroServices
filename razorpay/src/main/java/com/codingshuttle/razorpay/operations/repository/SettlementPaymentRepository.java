package com.codingshuttle.razorpay.operations.repository;

import com.codingshuttle.razorpay.operations.entity.SettlementPayment;
import com.codingshuttle.razorpay.operations.entity.SettlementPaymentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettlementPaymentRepository extends JpaRepository<SettlementPayment, SettlementPaymentId> {
}
