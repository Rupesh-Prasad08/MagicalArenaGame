package com.magicalarena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Player A:");
        System.out.print("Name: ");
        String nameA = scanner.nextLine();
        System.out.print("Health: ");
        int healthA = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthA = scanner.nextInt();
        System.out.print("Attack: ");
        int attackA = scanner.nextInt();

        System.out.println("\nEnter details for Player B:");
        scanner.nextLine(); // Consume leftover newline
        System.out.print("Name: ");
        String nameB = scanner.nextLine();
        System.out.print("Health: ");
        int healthB = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthB = scanner.nextInt();
        System.out.print("Attack: ");
        int attackB = scanner.nextInt();

        // Create player objects
        Player playerA = new Player(nameA, healthA, strengthA, attackA);
        Player playerB = new Player(nameB, healthB, strengthB, attackB);

        // Initialize the arena
        MagicalArena arena = new MagicalArena(playerA, playerB);

        // Start the fight
        arena.startFight();

        scanner.close();
    }
}
