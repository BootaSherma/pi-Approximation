import java.util.Random;

public class Pi {
    public static void main(String[] args) {
        System.out.println(calculate((int) 1e7));//prints the result
    }
    public static float calculate(int runs){
        Random random = new Random(System.currentTimeMillis());
        int circle = 0;
        float Pi = 0;
// using a for loop to calculate
        for (int i = 0; i < runs; i++){
            float x = random.nextFloat();
            float y = random.nextFloat();
            float cordinate = x * x + y * y;
            if ((cordinate <= 1)){
                circle ++;
            }
            Pi = 4 * ((float) circle / (float) (i));
        }
        return Pi;
    }
}
