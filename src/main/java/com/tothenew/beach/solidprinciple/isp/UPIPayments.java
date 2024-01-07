package com.tothenew.beach.solidprinciple.isp;
/*
* It states that a client should not be forced to depend on interfaces that it does not use.
* In other words, it is better to have multiple smaller interfaces that are tailored to specific needs rather
* than a single larger interface that tries to cover everything.
*/
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

}
