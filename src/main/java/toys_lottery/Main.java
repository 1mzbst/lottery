package toys_lottery;

import toys_lottery.lottery.Lottery;
import toys_lottery.player.GetPlayer;
import toys_lottery.player.Player;
import toys_lottery.toys.ListOfToys;
import toys_lottery.toys.Toys;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        ArrayList <Player> getP = new ArrayList<>();
        getP = GetPlayer.getPlayers();
        System.out.println(getP);

        // у нас есть функция создающая список участников(заменить названия классов) и есть список игрушек,
        // следующий этап совместить эти вещи в лоттерею и сделать вывод в документ

//        System.out.println(ListOfToys.getListOfToys());



        /**
         * Создаю натуральную очередь для проверки работосопосбности помещения и ввыдачи результата.
         */

//
//        ListOfToys.getListOfToys();
////        ArrayList<Integer> test4 = new ArrayList<>();
//        ArrayList<Toys> test5 = ListOfToys.getListOfToys();
//        System.out.println(test5);
//        PriorityQueue<Integer> weightNaturalQueue = new PriorityQueue<>();
//        for (int i = 0; i < test5.size(); i++) {
//
//            weightNaturalQueue.add(test5.get(i).getWeight());
////            test5.add(test5.get(i).getWeight());
//        }
//
//        while (weightNaturalQueue. size() != 0){
//            System.out.println(weightNaturalQueue.poll());
//        }
//        for (int i = 0; i < weightNaturalQueue.size(); i++) {
//            System.out.println(weightNaturalQueue.size());
//            System.out.println(weightNaturalQueue);
//            System.out.println(weightNaturalQueue.poll());

//        }












//        for (int i = 0; i < test.size(); i++) {
//            if (test.get(i).getWeight() == 83) {
//                System.out.println(test.get(i));
//            }
//        }
//
//        ArrayList <Integer> test2 = Lottery.getLottery();
//
//        for (int i = 0; i < test2.size(); i++) {
//            System.out.println(test2.get(i));
//
//        }

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
