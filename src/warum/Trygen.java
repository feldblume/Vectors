package warum;

/**
 * Created by nataliya on 28.10.14.
 */
public class Trygen <V extends Number> {
    public static void main(String[] args) {
        Double inums[] = {1.0, 2.0, 3.0, 4.0};
        Trygen<Double> ion = new Trygen<Double>(inums);
        System.out.println(ion.average());

    }

    V[] nums;
    public Trygen(V[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum/nums.length;
    }
}

