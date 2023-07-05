import java.lang.Math;

public class BmiService {
    public int calculate(int height, int weight) {
        double index = 10_000 * weight / (Math.pow(height, 2));
        return (int) index;
    }
}
