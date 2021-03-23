import java.util.Scanner;

public class Kalk {
    int x;
    int y;
    int z;
    String symbol;
    Scanner input = new Scanner(System.in);

    public void setMath() {

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
        System.out.println(""+x+" "+symbol+" "+y+" = "+z);

    }

    public void continueMath(){
        x=z;
        z=0;
        System.out.println("Input +,-,/ or *:");
        symbol = input.next();

        System.out.println("""
                Input another integer:""");
        y = input.nextInt();
    }
}
