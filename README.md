Magical Arena

This is a simple command-line program to simulate a turn-based battle between two players in a magical arena. Players have attributes like health, strength, and attack power, and the game progresses until one player's health reaches zero.

Features

Simulates turn-based combat between two players.

Player attributes (name, health, strength, and attack) are provided via user input.

Random dice rolls determine the outcome of attacks and defenses.

Clear output in the console showing the progress of the fight and the winner.

How to Run the Program

Prerequisites

Java Development Kit (JDK) installed (version 8 or above).

Eclipse IDE or any Java IDE (e.g., IntelliJ IDEA or VS Code).

Steps

Clone or Extract the Project

Download or extract the project files to a folder on your system.

Open in Eclipse

Launch Eclipse IDE.

Go to File > Open Projects from File System....

Select the project folder and click Finish.

Run the Program

In the Package Explorer, locate the Main.java file inside the com.magicalarena package.

Right-click Main.java and select Run As > Java Application.

Input Player Details

Enter the name, health, strength, and attack power for both players when prompted in the console.

View Output

The console will display the fight progress and announce the winner.

Code Structure

Classes

Player:

Models a player with attributes like health, strength, and attack.

Includes methods for dice rolls and calculating attack and defense values.

MagicalArena:

Handles the logic for the fight, alternating turns between players.

Determines the winner when one player's health reaches zero.

Main:

Entry point of the program.

Accepts user input for player details and initializes the game.

Sample Input/Output

Input

Enter details for Player A:
Name: Warrior
Health: 60
Strength: 8
Attack: 12

Enter details for Player B:
Name: Gladiator
Health: 80
Strength: 10
Attack: 9

Output

Fight begins!
Warrior attacks! Rolls: 4
Gladiator defends! Rolls: 2
Damage dealt: 36
Gladiator health: 44
------------
Gladiator attacks! Rolls: 6
Warrior defends! Rolls: 5
Damage dealt: 14
Warrior health: 46
------------
...
Winner: Warrior

How to Test

Unit Testing

JUnit Setup:

Ensure JUnit is available in your IDE.

Create test cases for the Player and MagicalArena classes to verify:

Dice roll values are between 1 and 6.

Attack and defense calculations are correct.

Player health updates correctly.

Run Tests:

Right-click the test files and select Run As > JUnit Test.

Known Limitations

Limited to two players.

No persistence; each game starts fresh.

Console-based interaction only.

Future Enhancements

Add more players and multiplayer support.

Create a graphical user interface (GUI) for better interaction.

Add special abilities or items to make the game more engaging.

# MagicalArenaGame
