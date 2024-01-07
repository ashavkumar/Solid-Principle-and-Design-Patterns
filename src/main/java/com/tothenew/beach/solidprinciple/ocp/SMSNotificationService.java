package com.tothenew.beach.solidprinciple.ocp;

public class SMSNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //write the logic to sms the otp.
    }

    @Override
    public void sendTransactionReport(String medium) {
        //write the logic to sms the transaction report.
    }
}
