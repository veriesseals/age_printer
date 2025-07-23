// Age Printer
// ----------------------------------------

import java.util.Scanner;

public class AgePrinter {

    public static void main(String[] args) {
        int userAge;

        System.out.print("Enter your age: ");
        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt();
        System.out.println(userAge + " is a great age.");


    }

    
}

