package ru.itis.inf304;

public class Caterpillar extends Creature {

    private static final int SPEED = 10;
    @Override
    public Point move() {
        int direction = (int)(Math.random() * 2);
        if (currPosition == null) init();

        switch (direction) {
            case 0:
                if (currPosition.getColumn() >= 1000) break;
                currPosition.setColumn(currPosition.getColumn()+SPEED); break;
            case 1:
                if (currPosition.getRow() <= 0) break;
                currPosition.setRow(currPosition.getRow()-SPEED); break;
            case 2:
                if (currPosition.getRow() >= 1000) break;
                currPosition.setRow(currPosition.getRow()+SPEED); break;
        }
        return currPosition;
    }
       public Caterpillar(String name) {
        this.name = name;
    }
}
