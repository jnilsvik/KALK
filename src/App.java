import java.util.Scanner;

public class App {
    static Scanner kalk = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {
        System.out.println("Number");
        double num1 = kalk.nextDouble();
        System.out.println("Number");
        double num2 = kalk.nextDouble();
        System.out.println("Operator [+ - * /]");
        char operator = kalk.next().charAt(0);
        System.out.println("Do you want to add another number? [y/n]");
        char yup = kalk.next().charAt(0);
        
        switch (yup) {
            case 'y':
                System.out.println("WIP");
            case 'n':
            switch (operator) {
                case '+':
                    System.out.println(num1+num2);
                    break;
      
                case '-':
                    System.out.println(num1-num2);
                    break;
      
                case '*':
                    System.out.println(num1*num2);
                    break;
      
                case '/':
                    System.out.println(num1/num2);
                    break;
      
                 default:
                    System.out.printf("Error! Write an accepted operator");
            }              
        }
    }
}
