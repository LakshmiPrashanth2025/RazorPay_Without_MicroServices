package com.codingshuttle.razorpay.vault.dto.response;

import com.codingshuttle.razorpay.common.enums.CardBrand;

public record TokenizeResponse(
        String token,
        String lastFour,
        CardBrand brand,
        Integer expiryMonth,
        Integer expiryYear
) {
}
