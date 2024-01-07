package com.tothenew.beach.designpattern.creational.factory;

public class OSFactory {
    public OS getInstance(String string) {
        if (string.equals("Open"))
            return new Android();
        else if (string.equals("Closed"))
            return new IOS();
        else return new Windows();
    }
}
