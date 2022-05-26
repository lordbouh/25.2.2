public class Main {


    public static void main(String[] args) {
/*

Make class Monster abstract
Fix class Zombie and ...

*/

        Battle battle = new Battle();
        battle.add(new Zombie("Alice", 3));
        battle.add(new Zombie("Bob", 3));
        battle.add(new Zombie("Eve", 3));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.start();


/*

                       ...and The Battle starts!

*/
    }

}
