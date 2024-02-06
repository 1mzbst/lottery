package toys_lottery.lottery;


import java.util.Random;

public class Lottery {
    public static int getLottery(){

        Random random = new Random();
        int randomValue = random.nextInt(100);

        return randomValue;
    }
}