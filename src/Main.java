public class Main {

    public static void main(String[] args) throws InterruptedException {
        Warrior kliczko = new Warrior("Kliczko", 600, 155,50);
        Warrior walujew = new Warrior("Wałujew", 800, 90,65);
        Battle.startFight(kliczko, walujew);
    }
}
