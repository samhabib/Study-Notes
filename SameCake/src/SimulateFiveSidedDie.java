import java.util.Random;

public class SimulateFiveSidedDie {

    private static final Random rnd = new Random();

    private static int rand7() {
        return rnd.nextInt(7) + 1;
    }

    public static int rand5() {

        // implement rand5() using rand7()
        int x;

        do{
            x = rand7();
        } while(x >= 6);

        return x;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", rand5());
        }
        System.out.println();
    }
}