package com.codingshuttle.razorpay.vault.repository;

import com.codingshuttle.razorpay.vault.entity.VaultCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VaultCardRepository extends JpaRepository<VaultCard, UUID> {
}
