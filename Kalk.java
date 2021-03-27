
import java.util.Scanner;

public class Kalk {
    boolean canContinue;
    double x,y,z;
    String symbol;
    String history = "";
    Scanner input = new Scanner(System.in);

    public void actionChoice(){
        System.out.println("Input a [Q] to quit, [N] for new/clear, or [C] for continue:");
        symbol = input.next().toUpperCase();
        switch (symbol){
            case "Q":
                System.out.println("I can believe you're leaving me!!!");
                break;
            case "N":
                System.out.println("Starting new calculation\n-----");
                newMath();
                break;
            case "C":
                if (!canContinue){
                    System.out.println("There is nothing to continue!");
                    actionChoice();
                }
                else {
                    continueMath();
                }
                break;
            default: actionChoice();
        }
    }

    public void newMath() {
        // vurder console rewrite: https://p2p.wrox.com/java-gui/19782-console-output-rewriting.html
        canContinue = true;
        setNumX();
        setSymbol();
        setNumY();
        doMath();
        actionChoice();
    }
    // burde sette de i "while" eller no?
    public void setSymbol(){
        System.out.println("Input a symbol [+,-,/ or *]: ");
        symbol = input.next();
        switch (symbol){
            case "+", "-", "/", "*":
                break;
            default:
                System.out.println("Please use one of the specified symbols");
                setSymbol();
        }
    }
    public void setNumX(){
        System.out.println("Input the first number: ");
        x = input.nextDouble();
    }
    public void setNumY(){
        System.out.println("Input another number: ");
        y = input.nextDouble();
    }

    public void doMath(){
        switch (symbol) {
            case "+" -> z = x + y;
            case "-" -> z = x - y;
            case "/" -> z = x / y;
            case "*" -> z = x * y;
            default -> System.out.println("Please use ONE of the specified chars");
        }
        System.out.println(history = x+ " "+ symbol +" " + y + " = " + z+ " | \n");
    }

    public void continueMath(){
        x=z;
        z=0;
        System.out.println("-----");
        setSymbol();
        setNumY();
        doMath();
    }
}
