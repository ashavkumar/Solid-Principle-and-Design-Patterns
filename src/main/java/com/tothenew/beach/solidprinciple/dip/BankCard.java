package com.tothenew.beach.solidprinciple.dip;
/*
* It states that high-level modules should not depend on low-level modules. Instead,
* both should depend on abstractions. This promotes loose coupling and flexibility,
* making it easier to make changes without affecting other parts of the system.
*/
public interface BankCard {
    public void doTransaction(long amount);
}
