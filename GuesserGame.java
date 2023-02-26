package GameProject;

import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;

    }
}

class Player {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! kindly the guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();

    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();

    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {

            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All player won the game");
            }

            else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player1 and Player2 won te game");
            }

            else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player1 and Player3 won the game");
            }

            else {
                System.out.println("Player1 won the game");
            }

        }

        else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 and Player3 won the game");

            }

            else {
                System.out.println("Player2 won the game");

            }

        }

        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 won the game");
        }

        else {
            System.out.println("All are Wrong! and all lost the game");
        }

    }
}

public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

    }

}
