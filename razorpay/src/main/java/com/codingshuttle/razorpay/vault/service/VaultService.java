package com.codingshuttle.razorpay.vault.service;

import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.payment.processor.dto.PaymentProcessorResponse;
import com.codingshuttle.razorpay.vault.dto.request.TokenizeRequest;
import com.codingshuttle.razorpay.vault.dto.response.TokenizeResponse;
import org.jspecify.annotations.Nullable;

import java.util.Map;
import java.util.UUID;

public interface VaultService {

    TokenizeResponse tokenize(TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}
