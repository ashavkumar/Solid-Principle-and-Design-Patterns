package com.tothenew.beach.solidprinciple.ocp;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //write the logic to mail the otp.
    }

    @Override
    public void sendTransactionReport(String medium) {
        //write the logic to mail the transaction report.
    }
}