package toys_lottery;

import toys_lottery.lottery.Lottery;
import toys_lottery.toys.Toys;

import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Toys doll = new Toys(1, "ПатПат", 1, 3);
        Toys doll2 = new Toys(2, "Кря-Кря", 4, 34);
        Toys doll3 = new Toys(3, "Жмяк", 10, 83);
        
        ArrayList<Toys> test = new ArrayList<>();
        test.add(doll);
        test.add(doll2);
        test.add(doll3);

        for (int i = 0; i < test.size(); i++) {
            if (test.get(i).getWeight() == 83) {
                System.out.println(test.get(i));
            }
        }

        ArrayList <Integer> test2 = Lottery.getLottery();

        for (int i = 0; i < test2.size(); i++) {
            System.out.println(test2.get(i));

        }

//            String arg = args[i];
//
//        }
//
//        PriorityQueue<Toys> test2 = new PriorityQueue<>();
//        test2.add(doll);
//        test2.add(doll2);
//        test2.add(doll3);
//        test2.comparator().compare();
//    //        System.out.println(test);
//        System.out.println(test2);






//        while (!test2.isEmpty()) {
//            System.out.println(test2.poll());
//        }

//        PriorityQueue<Integer> test2 = new PriorityQueue<Integer>();
//        test2.add(1);
//        test2.add(2);
//        test2.add(4);
//        test2.add(18);
//        test2.add(5);
//
//        while (!test2.isEmpty()){
//            System.out.println(test2.poll());
//        }
//
//        System.out.println(test2);



//        test2.add(test.get(1));
//        test2.add(test.get(2));










//        PrintWriter itog = new PrintWriter("Result.txt", "UTF-8");
//        itog.println(test);
//        itog.close();
    }



}
