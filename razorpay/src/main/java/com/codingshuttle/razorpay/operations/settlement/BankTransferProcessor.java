package com.codingshuttle.razorpay.operations.settlement;

import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.operations.settlement.dto.BankTransferResult;

import java.util.UUID;

public interface BankTransferProcessor {

    BankTransferResult initiate(UUID settlementId, UUID merchantId, Money amount,
                                String bankAccount, String ifsc);
}
