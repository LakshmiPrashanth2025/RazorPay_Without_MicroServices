package com.codingshuttle.razorpay.merchant.service;

import com.codingshuttle.razorpay.merchant.dto.request.LoginRequest;
import com.codingshuttle.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.codingshuttle.razorpay.merchant.dto.response.LoginResponse;
import com.codingshuttle.razorpay.merchant.dto.response.MerchantResponse;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);

    LoginResponse login(LoginRequest request);
}
