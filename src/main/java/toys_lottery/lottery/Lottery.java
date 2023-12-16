package toys_lottery.lottery;


import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    public static ArrayList<Integer> getLottery(){

        ArrayList<Integer> lotteryResult = new ArrayList<>();

            for (int i = 0; i < 3; i++) {

                Random random = new Random();
                int randomValue = random.nextInt(10);

                lotteryResult.add(randomValue);

//                System.out.println(lotteryResult.get(i));
            }

        return lotteryResult;
    }
}