package com.tothenew.beach.solidprinciple.ocp;
/*
* The software entities such as classes, modules, and functions should be open for extension
* but closed for modification. This principle states that you should be able to add new
* functionality to a system without having to modify existing code.
*/
public interface NotificationService {
    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
