package com.codingshuttle.razorpay.merchant.dto.response;

import com.codingshuttle.razorpay.common.enums.BusinessType;
import com.codingshuttle.razorpay.common.enums.MerchantStatus;
import lombok.Data;

import java.util.UUID;

public record MerchantResponse(
        UUID id,
        String name,
        String email,
        String businessName,
        BusinessType businessType,
        MerchantStatus merchantStatus
) {
}
