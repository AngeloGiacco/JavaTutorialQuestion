package com.company.battlingFighters;

import java.util.Random;

public class Fighter {
    final Random rand = new Random();
    private final String name;
    private final String type;
    private final int skill = rand.nextInt(18)+1;
    private int stamina = rand.nextInt(24)+1;

    public Fighter(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getFighterInfo(){
        return name + " - " + type + " - skill: "+ skill + "; stamina: "+ stamina;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage){
        stamina -= damage;
        if (stamina < 0) {
            stamina = 0;
        }
    }

    private int rollDice() {
        Random rand = new Random();
        int upperbound = 6;
        return rand.nextInt(upperbound)+1;
    }

    public int rollDie(){
        return rollDice() + rollDice();
    }

    public int calculateAttackScore(){
        return rollDie() + skill;
    }

    public boolean isDead(){
        return stamina <= 0;
    }

    public void winner() {
        System.out.println("End of battle, "+name+" - "+type+" - " +
                "skill: "+skill+"; stamina: "+stamina+" wins!");
    }


}
