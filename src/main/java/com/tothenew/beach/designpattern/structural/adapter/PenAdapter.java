package com.tothenew.beach.designpattern.structural.adapter;

public class PenAdapter implements Pen {
    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String string) {
        pilotPen.mark(string);
    }
}