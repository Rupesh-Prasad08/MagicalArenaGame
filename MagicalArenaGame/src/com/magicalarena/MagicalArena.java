package com.magicalarena;

public class MagicalArena {
    private Player playerA;
    private Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startFight() {
        System.out.println("Fight begins!");

        while (playerA.isAlive() && playerB.isAlive()) {
            Player attacker = playerA.getHealth() <= playerB.getHealth() ? playerA : playerB;
            Player defender = attacker == playerA ? playerB : playerA;

            fightTurn(attacker, defender);
        }

        Player winner = playerA.isAlive() ? playerA : playerB;
        System.out.println("Winner: " + winner.getName());
    }

    private void fightTurn(Player attacker, Player defender) {
        int attackRoll = attacker.rollDice();
        int defenseRoll = defender.rollDice();

        int attackDamage = attacker.calculateAttackDamage(attackRoll);
        int defenseStrength = defender.calculateDefenseStrength(defenseRoll);

        int damageToDefender = Math.max(0, attackDamage - defenseStrength);
        defender.setHealth(defender.getHealth() - damageToDefender);

        System.out.println(attacker.getName() + " attacks! Rolls: " + attackRoll);
        System.out.println(defender.getName() + " defends! Rolls: " + defenseRoll);
        System.out.println("Damage dealt: " + damageToDefender);
        System.out.println(defender.getName() + " health: " + defender.getHealth());
        System.out.println("------------");
    }
}
