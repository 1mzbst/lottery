package toys_lottery.lottery;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LotteryResult {
        public LotteryResult() throws FileNotFoundException, UnsupportedEncodingException {

            PrintWriter docResult = new PrintWriter("Result.txt", "UTF-8");
            docResult.println();
            docResult.close();
        }
}
