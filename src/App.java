import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner kalk = new Scanner(System.in);
    static private Num num;
    
    public static void main(String[] args) throws Exception {
        double num1, num2, result;
        result = 0;
        char operator;
        do {
            System.out.println("Start anew by picking an operator [+ - * /] or Continue prior calculation [C] or Exit [Q]");
                operator = kalk.next().charAt(0);
                        switch (operator) {
                            case '+':
                                System.out.println("Would you kindly enter the 1st number");
                                num1 = kalk.nextDouble();
                                System.out.println("Would you kindly enter the 2nd number");
                                num2 = kalk.nextDouble();
                                result = num1 + num2;
                                System.out.println(num1 + " + " + num2 + " = ");
                                System.out.println(result);
                                break;
                                    
                            case '-':
                                System.out.println("Would you kindly enter the 1st number");
                                num1 = kalk.nextDouble();
                                System.out.println("Would you kindly enter the 2nd number");
                                num2 = kalk.nextDouble();
                                result = num1 - num2;
                                System.out.println(num1 + " - " + num2 + " = ");
                                System.out.println(result);
                                break;
                  
                            case '*':
                                System.out.println("Would you kindly enter the 1st number");
                                num1 = kalk.nextDouble();
                                System.out.println("Would you kindly enter the 2nd number");
                                num2 = kalk.nextDouble();
                                result = num1 * num2;
                                System.out.println(num1 + " * " + num2 + " = ");
                                System.out.println(result);
                                break;
                  
                            case '/':
                                System.out.println("Would you kindly enter the 1st number");
                                num1 = kalk.nextDouble();
                                System.out.println("Would you kindly enter the 2nd number");
                                num2 = kalk.nextDouble();
                                result = num1 / num2;
                                System.out.println(num1 + " / " + num2 + " = ");
                                System.out.println(result);
                                break;
                            case 'C':
                                System.out.println("Pick an operator [+ - * /]");
                                operator = kalk.next().charAt(0);
                                switch (operator) {
                                    case '+':
                                        System.out.println("Would you kindly enter the 2nd number");
                                        num2 = kalk.nextDouble();
                                        System.out.println(result + " + " + num2 + " = ");
                                        result = result + num2;
                                        System.out.println(result);
                                        break;     
                          
                                    case '-':
                                        System.out.println("Would you kindly enter the 2nd number");
                                        num2 = kalk.nextDouble();
                                        System.out.println(result + " - " + num2 + " = ");
                                        result = result - num2;
                                        System.out.println(result);
                                        break;
                          
                                    case '*':
                                        System.out.println("Would you kindly enter the 2nd number");
                                        num2 = kalk.nextDouble();
                                        System.out.println(result + " * " + num2 + " = ");
                                        result = result * num2;
                                        System.out.println(result);
                                        break;
                        
                                    case '/':
                                        System.out.println("Would you kindly enter the 2nd number");
                                        num2 = kalk.nextDouble();
                                        System.out.println(result + " / " + num2 + " = ");
                                        result = result / num2;
                                        System.out.println(result);
                                        break;
                            case 'Q':
                                System.exit(0);

                            default:
                                System.out.printf("Error! Write an accepted operator");
                        }       
                    }      
          } while (operator != 'Q');
        
    }
}


