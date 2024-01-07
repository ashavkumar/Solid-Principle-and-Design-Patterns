package com.tothenew.beach.solidprinciple.dip;

public class ShoppingMall {
    private BankCard bankCard;
    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }
}
