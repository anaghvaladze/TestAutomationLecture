//package org.example;
//
//public class SecondLecture {
//    static void main() {
//
//        /*int x = 20;
//        char symbol = 'A';
//        String studentName = "Giorgi";
//
//        String studentName = "Giorgi     l";
//
//        // უპარამეტრო მეთოდები
//         String newStudentName = studentName.toUpperCase();
//        System.out.println(studentName.toUpperCase());
//        System.out.println(studentName.toLowerCase());
//        System.out.println(studentName.length());
//        System.out.println(studentName.indexOf('i'));
//        System.out.println(studentName.length());
//        System.out.println(studentName.charAt(2));
//        System.out.println(studentName.contains("orty"));
//        System.out.println(studentName.contains("o"));
//        System.out.println(studentName.replace("G", "L"));*/
//
//
//        //პარამეტრიანი მეთოდები
//
//        /*int age = 30;
//        String firstName = " Lela";
//        String lastname = " Gabelaia";
//         String newText = " Test";
//        System.out.println(firstName + " " +  lastname);
//        System.out.println(firstName.concat(lastname));
//         System.out.println(firstName + age);
//        System.out.println(firstName.concat(lastname).concat(newText));*/
//
//
//        // კლასის ობიექტის შექმნა
//
//        //String firstname = "Lela"; უობიექტოდაც შემძლია
//        //String firstName = new String(); შევქმენი ობიექტი და ისე გადავცემ პარამეტრებს
//        // firstName = "Lela";
//
//
//        // შედარება სტრინგთან როცა ობიექტი არ მაქ შექმნილი
//
//        // String text1 = "Lela";
//        // String text2 = "Lela";
//
//        // System.out.println(text1 == text2);
//
//
//        //String text3 = "Lela";
//        // String text4 = "Giorgi";
//
//
//        //System.out.println(text3 == text4);
//        // System.out.println(text3.equals(text4));
//
//
//        //როცა ვქმნი ობიექტს რა ხდება შედარების დროს
//
//
//        //String text1 = new String("Lela");
//        //String text2 = new String("Lela");
//
//
//        // System.out.println(text1 == text2);
//        // ystem.out.println(text1.equals(text2));
//
//        //String test = "35";
//        //String age = "25";
//
//        // System.out.println(test + age);
//
//
//        //System.out.println(" I 'Love' Testing");
//        //System.out.println(" I \n'Love' Testing");
//        // System.out.println(" I \\'Love' \\Testing");
//
//
//
//
//        //// Math Class
//
//
//       /*int x = 20;
//         int y = 50;
//
//       int z = Math.max(x,y);
//       System.out.println(z);*/
//
//
//       /*int z = Math.min(x,y);
//       System.out.println(z);
//
//      double result =  Math.sqrt(16);
//      System.out.println(result);
//
//
//       //int result = (int) (Math.random() * 1000);
//       //System.out.println(result);
//
//
//
//        System.out.println(Math.max(7,-17));
//
//
//        int x = 5;
//        int y = 10;
//
//        System.out.println(Math.addExact(x, y));
//
//
//
//
//        */
//
//
//       /* ამოცანა: სესხის აღება შესაძლებელია მინ 20 წლიდან,
//        შესაბამისად სესხის გაცემამდე უნდა მოხდეს მომხმარებლის ასაკის შემოწმება
//
//
//        int minAge = 20;
//        int currentAge = 15 ;
//
//
//        if (currentAge >= minAge){
//
//            System.out.println("შეგიძლია აიღო სესხი");
//        }
//        else {
//            System.out.println("ჯერ პატარა ხარ");
//        } */
//
//
//        //ამოცანა:
//
//
//       /* თუ მომხმარებლის ასაკი არის 6-18 ჩათვლით ,შეუძ₾ია აიღოს სკოლის მოსწავლის ბარათი
//        თუ მომხმარებლის ასაკი არის 19-24 ჩათვლით შუძ₾ია აიღოს სტუდენტის ბარათი
//        თუ მომხმარებლის ასაკი არის 25-64 ჩათვლით შეუძ₾ია აიღოს ბიზნეს ბარათი
//        თუ მომხმარებლის ასაკი არის > 64 შეუძ₾ია აიღოს საპენსიო ბარათი
//        თუ მომხმარებელი არის 6 წლამდე ასაკის მაშინ ვერ გახსნის ბარათს*/
//
//
//          /*int age = 25;
//
//        if (age >= 6 && age <= 18) {
//            System.out.println("შეგიძლია აიღო სკოლის ბარათი");
//        } else if (age >= 19 && age <= 24) {
//            System.out.println("სტუდენტის ბარათი");
//        } else if (age >= 25 && age <= 64) {
//            System.out.println("ბიზნეს ბარათი");
//        } else if (age >= 64) {
//            System.out.println("საპენსიო ბარათი");
//        } else {
//            System.out.println("ჯერ ძალიან პატარა ხარ");
//        }
//
//
//    }
//}*/
//
//
//
//    /*თუ სტუდენეტი აიღებს მინიმუმ 70 ქულას მას გადაეცემა c დონის სერთიფიკატი
//    თუ სტუდენტი აიღებს მინიმუმ 80 ქულას მას გადაეცემა  b დონის სერთიფიკატი
//    თუ სტუდენტი აიღებს მინიუმ 90 ქულას, მას გადაეცემა a დონის სერთიფიკატი
//    თუ სტუდენტი აიღებს 70 ქულაზე ნაკლებს მას არ გადაეცემა სერთიფიკატი*/
//
//
//       /* int finalScore = 98;
//
//        if (finalScore >= 70 && finalScore <=70) {
//
//            System.out.println("C");
//
//        } else if (finalScore >= 80 && finalScore <=80) {
//
//            System.out.println("B");
//
//        } else if (finalScore >= 90) {
//
//            System.out.println("A");
//
//        } else {
//            System.out.println("არ გადაეცემა სერთიფიკატი");
//        }
//
//
//    }*/
//
//
//       /* int minAge = 20;
//        int currentAge = 35;
//
//        if (currentAge <= minAge) {
//
//            System.out.println("No Load");
//        } else {
//            System.out.println("Yes Loan");
//        }
//
//    }
//
//}*/
//        //მოკლედ ასე შეიძლება ჩიწეროს
//
//       /*
//        int minAge = 20;
//        int currentAge = 79;
//
//        String result = (currentAge <= minAge) ? ("No Load") : ("Yes Loan");
//        System.out.println(result);
//
//    }
//
//    }*/
//
//
        // switch არ ემუშავება boolean ს
////
////
////        int statusCode = 500;
////
////        switch (statusCode) {
////            case 200:
////                System.out.println("OK");
////                break;
////            case 400:
////                System.out.println("Bad Request");
////                break;
////            case 401:
////                System.out.println("Unautorized");
////                break;
////            case 404:
////                System.out.println("Not Found");
////                break;
////            case 500:
////                System.out.println("Server error");
////                break;
////            default:
////                System.out.println("Other status");
////        }
////
////    }
////
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
