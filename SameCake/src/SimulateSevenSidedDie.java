import java.util.Random;

public class SimulateSevenSidedDie {

    private static final Random rnd = new Random();

    private static int rand5() {
        return rnd.nextInt(5) + 1;
    }

    public static int rand7() {

        int ans;

        do{

            ans = (rand5() -1) * 5 + (rand5());

        } while (ans > 21);

        return ans % 7 + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            System.out.printf("%d ", rand7());
        }
        System.out.println();
    }
}