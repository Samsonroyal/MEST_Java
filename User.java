public class User {
    // first name of the user
     String firstName = "Bright"; 
     String lastName = "Ahedor";

    int age = 23;
    boolean hasMoney = true;

    private static void presentName(){

                double amountPaid = 23.05;
        double amountCredited = 12;
        double result = amountPaid/amountCredited;
        
        int amountConverted = (int) amountPaid;

        System.out.print("New Value:" + amountConverted );
        System.out.println("Result:" + result );

    }

    private static void presentName( String s){


    }
    
    private static double addTwoNumber(double numOne, double numTwo){
        return numOne + numTwo;
    }

    }
