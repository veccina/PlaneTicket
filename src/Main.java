import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance to be traveled in km : ");
        int km = input.nextInt();

        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        System.out.print("Please enter your trip type ('1' For one way tickets, '2' for round-trip tickets) : ");
        int trip = input.nextInt();

        double total = km * 0.10;

        if (km > 0 && age > 0 && (trip == 1 || trip == 2)) {
            if (age < 12) {
                total = total * 0.50;
            } else if (age >= 12 && age <= 24) {
                total = total * 0.90;
            } else if (age >= 65) {
                total = total * 0.70;
            }
            if (trip == 2) {
                total = total * 0.80;
            }
            System.out.println("Total ticket price : " + total);
        }else{
                System.out.println("You entered wrong type of value");
            }
        }

    }
