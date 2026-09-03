## TBD
### Refund Flow

1. Enums — RefundStatus
2. Entity — Refund
3. State machine — RefundStateMachine + RefundEvent
4. Repository — RefundRepository
5. Service — RefundService/RefundServiceImpl:
6. Async processor — RefundProcessor (@Scheduled job pulling PENDING/PROCESSING refunds)
7. Controller — RefundController (POST /v1/payments/{paymentId}/refund and GET /v1/payments/refunds/{refundId})
