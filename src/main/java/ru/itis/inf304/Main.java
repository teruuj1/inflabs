package ru.itis.inf304;
/* ИГРА
1. игровое поле 1000 х 1000
2. 4 персонажа : нечто, муравей, черепаха, гусеница
3. 2 действия : показать позицию, вывести имя и координаты
4. старт - (int)(Math.random() * 1000)
5. направление каждого существа - случайно
6. запуск бесконечного цикла, пока кто-то не окажется в нужной зоне
 */

public class Main {

    private Creature[] creatures;
    private void initGame() {
        creatures = new Creature[4];
        creatures[0] = new Something("smth");
        creatures[1] = new Ant("ant");
        creatures[2] = new Turtle("turtle");
        creatures[3] = new Caterpillar("caterpillar");

        for (Creature c: creatures) {
            c.init();
            System.out.println(c);
        }
    }


    private void startGame() {
        while (true) {
           for (Creature c: creatures) {
               Point p = c.move();
               if (inSquare(p)) {
                   c.print();
                   break;
               }
           }
        }
    }


    private boolean inSquare(Point p) {
        // реализовать проверку нахождения в прямоугольнике (400; 400) - (600; 600)
        return p.getRow() >= 400 && p.getColumn() <= 600 && p.getRow() <= 600 && p.getColumn() >= 400;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.initGame();
        main.startGame();
    }
}