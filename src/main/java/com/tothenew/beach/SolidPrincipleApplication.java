package com.tothenew.beach;

import com.tothenew.beach.designpattern.creational.builder.Phone;
import com.tothenew.beach.designpattern.creational.builder.PhoneBuilder;
import com.tothenew.beach.designpattern.creational.factory.OS;
import com.tothenew.beach.designpattern.creational.factory.OSFactory;
import com.tothenew.beach.designpattern.structural.adapter.AssignmentWork;
import com.tothenew.beach.designpattern.structural.adapter.Pen;
import com.tothenew.beach.designpattern.structural.adapter.PenAdapter;
import com.tothenew.beach.solidprinciple.dip.BankCard;
import com.tothenew.beach.solidprinciple.dip.CreditCard;
import com.tothenew.beach.solidprinciple.dip.ShoppingMall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidPrincipleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidPrincipleApplication.class, args);

        //DebitCard debitCard=new DebitCard();
        //CreditCard creditCard=new CreditCard();
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);

        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("Open");
        os.spec();

        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
        System.out.println(phone);

        AssignmentWork assignmentWork = new AssignmentWork();
        Pen pen = new PenAdapter();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("I'm bit tired to Write the Assignment.");
    }
}