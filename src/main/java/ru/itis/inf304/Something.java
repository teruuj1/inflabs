package ru.itis.inf304;

public class Something extends Creature {
    public Point move() {
        currPosition =
                new Point ((int)(Math.random() * 1000), (int)(Math.random() * 1000));
        return currPosition;
    }
    public Something(String name) {
        this.name = name;
    }

}
