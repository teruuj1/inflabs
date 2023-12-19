package ru.itis.inf304;

public class Ant extends Creature {
    @Override
    public Point move() {
        int direction = (int)(Math.random() * 3);
        if (currPosition == null) init();

        switch (direction) {
            case 0:
                if (currPosition.getColumn() == 0) break;
                currPosition.setColumn(currPosition.getColumn()-1); break;
            case 1:
                if (currPosition.getColumn() == 1000) break;
                currPosition.setColumn(currPosition.getColumn()+1); break;
            case 2:
                if (currPosition.getRow() == 0) break;
                currPosition.setRow(currPosition.getRow()-1); break;
            case 3:
                if (currPosition.getRow() == 1000) break;
                currPosition.setRow(currPosition.getRow()+1); break;
        }
        return currPosition;
    }
    public Ant(String name) {
        this.name = name;
    }
}
