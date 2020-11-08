public class BmiService {
    public int calculate (double weight, int growthInSm) {
        double growthSquareInMetr = growthInSm * growthInSm / 100.0 / 100.0;
        double index = weight / growthSquareInMetr;
        return (int)index;
    }
}
