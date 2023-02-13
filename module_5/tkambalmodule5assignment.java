import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class tkambalmodule5assignment {
    public static void main(String[] args) {
        int denominator = 3;
        double sum = 0;
        List<String> fractions = new ArrayList<>();

        while (denominator < 100) {
            String fraction = "1/" + denominator;
            fractions.add(fraction);
            sum += (double) 1/denominator;
            denominator += 2;
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Smaller to Larger: " + fractions);
        System.out.println("Mathmatical Results: " + df.format(sum));
        System.out.println("Larger to Smaller: " + fractions);
        System.out.println("Mathmatical Results: " + df.format(sum));
    }
}
