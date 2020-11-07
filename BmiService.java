public class BmiService {
    public int calculate (double weight, int growthinsm) {
        double growthsquareinmetr = growthinsm * growthinsm / 100.0 / 100.0;
        double index = weight / growthsquareinmetr;
        return (int)index;
    }
}
