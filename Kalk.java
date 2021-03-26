import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalk {
    int x;
    int y;
    int z;
    String symbol;
    String history = "";
    Scanner input = new Scanner(System.in);

    public void setMath() {
        // vurder console rewrite: https://p2p.wrox.com/java-gui/19782-console-output-rewriting.html
        System.out.println("""
                Calculator booted!\s
                Input an integer:""");
        x = input.nextInt();

        System.out.println("Input +,-,/ or *:");
        symbol = input.next();

        System.out.println("""
                Input another integer:""");
        y = input.nextInt();
    }

    public void doMath(){

        switch (symbol) {
            case "+" -> {
                z = x + y;
            }
            case "-" -> {
                z = x - y;
            }
            case "/" -> {
                z = x / y;
            }
            case "*" -> {
                z = x * y;
            }
            default -> System.out.println("Please use ONE of the specified chars");
        }
        history += "= "+ z +" | ";
        //kan erstatte denne med en array so holder historien for hver utregning sennere

        System.out.println(history = x+ " "+ symbol +" " + y + " = " + z);

    }

    public void continueMath(){
        x=z;
        z=0;

        System.out.println("-----" +x + "\nInput +,-,/ or *:");
        symbol = input.next();

        System.out.println("""
                Input another integer:""");
        y = input.nextInt();
    }
}
