package ru.itis.inf304;

public abstract class Creature implements Moveable, Printeable {
    protected String name;
    protected Point currPosition;

    public void init() {
        currPosition =
                new Point((int)(Math.random() * 1000), (int)(Math.random() * 1000));
    }

    public abstract Point move();

    public void print() {
        System.out.println(name + " - " + currPosition);
    }
}
