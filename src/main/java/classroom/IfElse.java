package classroom;

public class IfElse {
    public static void main(String[] args) {

        // IF
        /*
        if(condition) {
        code to be executed
        }
         */

//        boolean x = 5 > 2;
//        System.out.println(x);
//
//        if(x) {
//            System.out.println("Yes, 5 is more than 2");
//        }
//
//        int number = 21;
//        if(number % 2 == 0) {
//            System.out.println("Number: " + number + " is even number");
//        } else {
//            System.out.println("Number: " + number + " is NOT even number");
//        }
//
//        int age = 18;
//        if(age <= 17) {
//            System.out.println("You are not allowed to buy here!");
//        } else {
//            System.out.println("Welcome to our shop");
//        }
//
//        boolean isSummer = true;
//        if(isSummer) {
//            System.out.println("Summer months: June, July, August");
//        }

        // IF-ELSE-IF

        /*
        if(condition){
        code to be executed
        } else {
        code to be executed
        }
         */

        int age = 18;
        if(age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else if (age < 0) {
            System.out.println("Who are you?");
        } else {
        System.out.println("Welcome to our shop");
        }

        // IF John = Hello John!
        // IF Zina = You are not welcome!
        // All others = Text

//        String name = "Max";
//        if (name.equals("John")) {
//            System.out.println("Hello Jhon!");
//        } else if (name.equals("Zina")) {
//            System.out.println("You are not welcome!");
//        } else {
//            System.out.println("Very interesting name!");
//        }

        // switch case
        // || = OR
        // && = AND

//        int currentMonth = 11;
//        switch (currentMonth) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("This is winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("This is spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("This is summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("This is autumn");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + currentMonth);
//        }

        // IF student1 = "John" and student2 = "Max"
        // Print: they will work together
        // &&

        String student1 = "John";
        String student2 = "Anna";
        if (student1.equals("John") || student2.equals("Max")) {
            System.out.println("They will work together");
        }
    }
}
