import java.util.Scanner;

public class CafeReservation{
    public static void main(String[] args) {
        //Deklarasikan variable yang dibutuhkan
        String name, gender, day, result;
        int age;
        double appearance, money;

        Scanner input = new Scanner(System.in);

        //inisialisasi variable
        result = "";

        //text input untuk inputan user
        System.out.println("Welcome to reservation Cafe 79.\n");
        System.out.println("Please insert your name: ");
        name = input.nextLine();

        System.out.println("How old are you: ");
        age = input.nextInt();

        System.out.println("What is your gender (Male/Female): ");
        gender = input.next();

        System.out.println("How attractive are you (1 - 10): ");
        appearance = input.nextDouble();

        System.out.println("How much money do you have: ");
        money = input.nextDouble();

        System.out.println("What day do you want to make a reservation: ");
        day = input.next();

        // If statement untuk pengecekkan kondisi tertentu
        if (day.equalsIgnoreCase("Monday")) {
            // If statement untuk pengecekkan kondisi Monday
            if (age >= 20 && age <= 30 && money >= 500) {
                result = "Reservation Success, You can order on Monday. Young Night.";
            } else {
                result = "Sorry Your can't order on Monday!!. Because it's for young night.";
            }
        } else if (day.equalsIgnoreCase("Tuesday")) {
            // If statement untuk pengecekkan kondisi Tuesday
            if (age >= 31 && age <= 50 && money >= 250) {
                result = "Reservation Success, You can order on Tuesday. Oldest Night.";
            } else {
                result = "Sorry Your can't order on Tuesday!!. Because it's for oldest night.";
            }
        } else if (day.equalsIgnoreCase("Wednesday")) {
            // If statement untuk pengecekkan kondisi Wednesday
            if (gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && appearance >= 8 && money >= 300) {
                result = "Reservation Success, You can order on Wednesday. Female Night.";
            } else {
                result = "Sorry Your can't order on Wednesday!!. Because it's for Female night.";
            }
        } else if (day.equalsIgnoreCase("Thursday")) {
            // If statement untuk pengecekkan kondisi Thursday
            if (gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && appearance >= 8 && money >= 300) {
                result = "Reservation Success, You can order on Thursday. Party Night for single.";
            } else if (gender.equalsIgnoreCase("Male") && age >= 20 && age <= 35 && money >= 1000) {
                result = "Reservation Success, You can order on Thursday. Party Night for single.";
            } else {
                result = "Sorry Your can't order on Thursday!!. Because it's for Party Night for single.";
            }
        } else if (day.equalsIgnoreCase("Friday")) {
            // If statement untuk pengecekkan kondisi Friday
            if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && appearance >= 8) {
                result = "Reservation Success, You can order on Friday. Woman Night.";
            } else if (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >= 1000) {
                result = "Reservation Success, You can order on Friday. Women Night.";
            } else {
                result = "Sorry Your can't order on Friday!!. Because it's for Woman Night.";
            }
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            // If statement untuk pengecekkan kondisi Friday
            if (age >= 18 && age <= 60 && money >= 100) {
                result = "Reservation Success, You can order on Weekend days. Weekend Freedom.";
            } else {
                result = "Sorry Your can't order on Friday!!. Because it's for Weekend Freedom";
            }
        }

        //output text hasil aplikasi
        System.out.println();
        System.out.println("Hi " + name + ", Thankyou for using our Application");
        System.out.println("Following results for your Reservation: ");
        System.out.println(result);
    }
}