package com.tothenew.beach.solidprinciple.ocp;

public class WhatsappNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //write the logic to whatsapp the otp.
    }

    @Override
    public void sendTransactionReport(String medium) {
        //write the logic to whatsapp the transaction report.
    }
}