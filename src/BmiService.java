public class BmiService {
    public float calculate (float weight, float hight) {
        return (float) (weight / (hight*hight / 10000));
    }
}
