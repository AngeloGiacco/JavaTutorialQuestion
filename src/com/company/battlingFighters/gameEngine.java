package com.company.battlingFighters;

public class gameEngine {

    private static void info(Fighter fighter1, Fighter fighter2) {
        System.out.println(fighter1.getFighterInfo());
        System.out.println(fighter2.getFighterInfo());
    }

    private static void separation(){
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        assert args.length == 4 : "Must supply name and type x2";

        Fighter f1 = new Fighter(args[0],args[1]);
        Fighter f2 = new Fighter(args[2],args[3]);

        System.out.println("At the start of the battle, stats are:");
        info(f1,f2);
        separation();

        while (!(f1.isDead() || f2.isDead())){
            int f1Attack = f1.calculateAttackScore();
            int f2Attack = f2.calculateAttackScore();
            System.out.println(f1.getName() + " attack: "+f1Attack);
            System.out.println(f2.getName() + " attack: "+f2Attack);
            if (f1Attack > f2Attack) {
                f2.takeDamage(2);
                info(f1,f2);
            }  else if (f2Attack > f1Attack) {
                f1.takeDamage(2);
                info(f1,f2);
            } else {
                System.out.println(f1.getName() +" draws with "+f2.getName());
            }
            separation();
        }
        if (f1.isDead()){
            f2.winner();
        } else {
            f1.winner();
        }
    }
}
