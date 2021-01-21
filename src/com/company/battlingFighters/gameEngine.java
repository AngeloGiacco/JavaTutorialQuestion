package com.company.battlingFighters;

public class gameEngine {

    private static void info(luckyFighter fighter1, luckyFighter fighter2) {
        System.out.println(fighter1.getFighterInfo());
        System.out.println(fighter2.getFighterInfo());
    }

    private static int THRESHOLD = 9;

    private static void separation(){
        System.out.println("----------------------");
    }

    private static int checkAttackLuck(luckyFighter fighter, int attackVal){
        Boolean lucky = fighter.testLuck();
        if (lucky) {
            System.out.println(fighter.getName()+" is lucky! His attack has increased to "+(attackVal * 2)+"!");
            return attackVal * 2;
        } else {
            System.out.println(fighter.getName()+" is not lucky! His attack has decreased to "+(attackVal - 1)+"!");
            return attackVal - 1;
        }
    }

    private static int checkDefenseLuck(luckyFighter fighter, int damageVal){
        Boolean lucky = fighter.testLuck();
        if (lucky) {
            System.out.println("They're in luck! "+fighter.getName()+"'s damage is partially resisted and reduce to "+(damageVal - 1)+"!");
            return damageVal - 1;
        } else {
            System.out.println(fighter.getName()+" is not lucky! His damage has increased to "+(damageVal + 1)+"!");
            return damageVal + 1;
        }
    }

    private static int checkAttack(luckyFighter fighter, int attackVal){
        if (fighter.getStrategy() == "aggressive"){
            System.out.println(fighter.getName()+" tries his luck...");
            return checkAttackLuck(fighter,attackVal);
        } else if (fighter.getStrategy() == "average"){
            if (fighter.getLuck() >= THRESHOLD){
                System.out.println(fighter.getName() +" has a good chance of being lucky so decides to test his luck...");
                return checkAttackLuck(fighter,attackVal);
            } else {
                System.out.println(fighter.getName() +" doesn't want to risk it so his attack remains at "+attackVal);
                return attackVal;
            }
        } else {
            System.out.println(fighter.getName() +" is defensive so his attack remains at "+attackVal);
            return attackVal;
        }
    }

    private static int checkDefense(luckyFighter fighter, int damageVal){
        if (fighter.getStrategy() == "defensive"){
            System.out.println(fighter.getName()+" tries his luck...");
            return checkDefenseLuck(fighter,damageVal);
        } else if (fighter.getStrategy() == "average"){
            if (fighter.getLuck() >= THRESHOLD){
                System.out.println(fighter.getName() +" has a good chance of being lucky so decides to test his luck...");
                return checkDefenseLuck(fighter,damageVal);
            } else {
                System.out.println(fighter.getName() +" doesn't want to risk it so his damage remains at "+damageVal);
                return damageVal;
            }
        } else {
            System.out.println(fighter.getName() +" is aggressive so his damage remains at "+damageVal);
            return damageVal;
        }
    }

    public static void main(String[] args) {

        assert args.length == 4 : "Must supply name and type x2";

        luckyFighter f1 = new luckyFighter(args[0],args[1]);
        luckyFighter f2 = new luckyFighter(args[2],args[3]);

        System.out.println("At the start of the battle, stats are:");
        info(f1,f2);
        separation();

        while (!(f1.isDead() || f2.isDead())){
            int f1Attack = f1.calculateAttackScore();
            int f2Attack = f2.calculateAttackScore();
            System.out.println(f1.getName() + " attack: "+f1Attack);
            System.out.println(f2.getName() + " attack: "+f2Attack);
            int damage = 2;
            if (f1Attack > f2Attack) {
                damage = checkAttack(f1,damage);
                damage = checkDefense(f2,damage);
                f2.takeDamage(damage);
                info(f1,f2);
            }  else if (f2Attack > f1Attack) {
                damage = checkAttack(f2,damage);
                damage = checkDefense(f1,damage);
                f1.takeDamage(damage);
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
