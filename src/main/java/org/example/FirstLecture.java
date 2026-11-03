package org.example;

public class FirstLecture {
    static void main() {

        //1

        double productPrice = 103;
        double finalPrice = productPrice;

        if (productPrice >= 100) {
            double discount = productPrice * 0.10;
            System.out.println("DiscountFinalPrices: " + (productPrice - discount) + " GEL");
        } else {
            System.out.println("Final price: " + finalPrice + " GEL");
        }

        //2


        String username = "Admin";
        String password = "1234";


        if (username.equals("Admin") && password.equals("1234")) {
            System.out.println("Login successful");

        } else {
            System.out.println("Invalid username or password");
        }

        //3

        int[] testResults = {1, 0, 1, 1, 0};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] == 1) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Passed tests: " + passed);
        System.out.println("Failed tests: " + failed);


//4


        String OrderStatus = "DELIVERED";
        switch (OrderStatus) {
            case "NEW":
                System.out.println("Order received");
                break;
            case "PROSSESING":
                System.out.println("Order is being prepared");
                break;
            case "SHIPPED":
                System.out.println("Order is on the way");
                break;
            case "DELIVERED":
                System.out.println("Order delivered");
                break;
            default:
                System.out.println("Unknown Status");


        }


        //5


        String text = "Lukaa";
        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u') {
                vowels++;
            }
        }

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }

        System.out.println("ხმოვნები: " + vowels);
        System.out.println("ტექსტის სიგრძე: " + text.length());
    }
}