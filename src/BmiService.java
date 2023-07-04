import java.lang.Math;
public class BmiService {
    public int calculate(int h, int w) {
        double index = 10_000 * w / (Math.pow(h, 2));
        return (int) index;
    }
}
