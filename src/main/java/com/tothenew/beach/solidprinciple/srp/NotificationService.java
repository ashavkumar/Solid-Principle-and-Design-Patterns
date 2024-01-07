package com.tothenew.beach.solidprinciple.srp;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //Write email related logic-Use JavaMailSenderAPI
        }
        if (medium.equals("call")) {
            //Write logic using twillio API
        }
        if (medium.equals("sms")) {
            //Write sms related logic
        }
    }
}
