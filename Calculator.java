import java.util.Scanner;

    /**
     * Author: Wyatt J. Long
     * Description: This calculator prompts the user to enter two different numbers and
     * a function. The calculator then performs the function and outputs the result
     * @param args
     */
public class Calculator implements Sum, Difference, Product, Quotient, PI, SqRoot, Square, Modulus {
    
    public static void main(String[] args) {
        boolean l = true;
        Scanner scan = new Scanner(System.in);

        Calculator c1 = new Calculator();

        System.out.println(" This is a calculator ");
        System.out.println("===========================");

        do {
            //prompts user to start calculation      
            System.out.println(" Enter first number: ");
            int num1 = scan.nextInt();

            System.out.println(" +, -, *, /, PI, Square, Root, Modulus ");
            String func = scan.next();

            if (func.equalsIgnoreCase("+")) {
                System.out.println(" Enter second number: ");
                int num2 = scan.nextInt();
    
                System.out.println("=========================");
                System.out.println("Sum: " + c1.add(num1, num2));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("pi")) {
    
                System.out.println("=========================");
                System.out.println("Result: " + c1.piTime(num1));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("square")) {
                System.out.println("=========================");
                System.out.println("Squared: " + c1.sq(num1));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("root")) {
                System.out.println("=========================");
                System.out.println("square root: " + c1.sqrt(num1));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("modulus")) {
                System.out.println(" Enter second number: ");
                int num2 = scan.nextInt();
    
                System.out.println("=========================");
                System.out.println("Modulus: " + c1.mod(num1, num2));
                System.out.println("=========================");
            }


            else if (func.equalsIgnoreCase("-")) {
                System.out.println(" Enter second number: ");
                int num2 = scan.nextInt();
    
                System.out.println("=========================");
                System.out.println("Difference: " + c1.sub(num1, num2));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("*")) {
                System.out.println(" Enter second number: ");
                int num2 = scan.nextInt();
    
                System.out.println("=========================");
                System.out.println("Product: " + c1.mult(num1, num2));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("/")) {
                System.out.println(" Enter second number: ");
                int num2 = scan.nextInt();
    
                System.out.println("=========================");
                System.out.println("Qoutient: " + c1.div(num1, num2));
                System.out.println("=========================");
            }

            else if (func.equalsIgnoreCase("exit")) {
                System.exit(0);// closes system
            }

            else {
                System.out.println("=========================");
                System.out.println(" Enter a proper function or enter: \"exit\" ");
                System.out.println("=========================");
            }


        } while (l);

        scan.close();
    }
}