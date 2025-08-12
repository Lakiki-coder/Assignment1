import java.util.Scanner;

public class 50QAndA {

    public static void greetingChooser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        if (name.equals("Alex")) {
            System.out.println("Hello, friend!");
        } else {
            System.out.println("Hi, stranger!");
        }
    }

    public static void petChooser() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type your favorite pet: ");
    String pet = scanner.nextLine();

    if (pet.equalsIgnoreCase("dog")) {
    System.out.println("Woof! Dogs are awesome!");
    } else {
    System.out.println("Cool choice, but I love dogs!");
        }
    }

    public static void favoriteNumberGame() {
    final int favoriteNumber = 7;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Guess my favorite number: ");
    int guess = scanner.nextInt();

    if (guess == favoriteNumber) {
    System.out.println("That's my favorite number!");
     } else {
    System.out.println("Nice try, guess again!");
       }
    }

    public static void countToFive() {
    int number = 1;
    while (number <= 5) {
    System.out.println("Number: " + number);
     number++;
        }
    }

    public static void evenOrOdd() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
     if (number % 2 == 0) {
    System.out.println("Even!");
        } else {
    System.out.println("Odd!");
       }
    }

    public static void multiplesOfThree() {
    int number = 3;
    while (number <= 15) {
    System.out.println(number);
    number += 3;
        }
    }

    public static void passwordChecker() {
    final String password = "secret123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String input = scanner.nextLine();

        if (input.equals(password)) {
            System.out.println("Access granted! Welcome!");
        } else {
            System.out.println("Access denied!");
        }
    }

    public static void countdown() {
    int number = 10;
    while (number >= 1) {
           System.out.println(number);
            number = number - 1;
        }
    }

    public static void trafficLight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a traffic light color (red, yellow, green): ");
        String color = scanner.nextLine();

        if (color.equalsIgnoreCase("green")) {
            System.out.println("Go!");
        } else if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop!");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Wait!");
        } else {
            System.out.println("Invalid color!");
        }
    }

    public static void squareNumbers() {
        int number = 1;
        while (number <= 5) {
            int square = number * number;
            System.out.println(number + " squared is " + square);
            number++;
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Greeting Chooser:");
        greetingChooser();

        System.out.println("\n2. Pet Chooser:");
        petChooser();

        System.out.println("\n3. Favorite Number:");
        favoriteNumberGame();

        System.out.println("\n4. Counting to 5:");
        countToFive();

        System.out.println("\n5. Even or Odd:");
        evenOrOdd();

        System.out.println("\n6. Multiples of 3:");
        multiplesOfThree();

        System.out.println("\n7. Password Checker:");
        passwordChecker();

        System.out.println("\n8. Counting Down:");
        countdown();

        System.out.println("\n9. Traffic Light:");
        trafficLight();

        System.out.println("\n10. Square Numbers:");
        squareNumbers();
    }
}
