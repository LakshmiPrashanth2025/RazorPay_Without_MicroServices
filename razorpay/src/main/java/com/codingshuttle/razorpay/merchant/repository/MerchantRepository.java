package com.codingshuttle.razorpay.merchant.repository;

import com.codingshuttle.razorpay.common.enums.MerchantStatus;
import com.codingshuttle.razorpay.merchant.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public interface MerchantRepository extends JpaRepository<Merchant, UUID> {
    boolean existsByEmail(String email);

    List<Merchant> findByStatus(MerchantStatus merchantStatus);
}
