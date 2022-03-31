public class Battle {

    public static void startFight (Warrior w1, Warrior w2) throws InterruptedException {
        while (true) {
            if (getAttackResult(w1, w2).equals("Game Over")) {
                System.out.println("Game over");
                break;
            }
            if (getAttackResult(w2, w1).equals("Game Over")) {
                System.out.println("Game over");
                break;
            }
        }
    }

    public static String getAttackResult (Warrior wA, Warrior wB) throws InterruptedException {

        int wAAttackAmount = wA.attack();
        int wBBlockAmount = wB.block();

        int dmgToWarriorB = wAAttackAmount - wBBlockAmount;


        if (dmgToWarriorB > 0) {
            wB.health = wB.health - dmgToWarriorB;
        } else dmgToWarriorB = 0;

        System.out.printf("%s Attacks %s and deals "
                        + "%d Damage\n", wA.getName(),
                wB.getName(), dmgToWarriorB);

        System.out.printf("%s has %d health\n\n",
                wB.getName(), wB.health);

        //pause
        Thread.sleep(1000);

        if (wB.health <= 0) {
            System.out.printf("%s has lost and %s is "
                            + "Victorious\n", wB.getName(),
                    wA.getName());
            return "Game Over";
        } else return "Fight again";
    }
}
