import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        Function<BigDecimal, BigDecimal> calculator = new CalculateFinalPriceImpl();

        System.out.print("input listing price: ");
        while (in.hasNext()) {
            String input = in.nextLine();
            if (input.equals("exit")) break;

            BigDecimal result = calculator.apply(new BigDecimal(input));
            System.out.println("final price: " + result);
            System.out.print("input listing price: ");
        }
    }
}
