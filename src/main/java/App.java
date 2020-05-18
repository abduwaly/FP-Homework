import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input listing price: ");
        while (in.hasNext()) {
            String s = in.nextLine();
            BigDecimal result = test(new BigDecimal(s));
            System.out.println("final price: " + result);
            System.out.print("input listing price: ");
        }
    }

    public static BigDecimal test(BigDecimal listingPrice) {
        BigDecimal rate = new BigDecimal(0.8);
        return listingPrice.multiply(rate);
    }
}
