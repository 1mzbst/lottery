package toys_lottery.player;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPlayer {
    public static ArrayList<Player> getPlayers (){
        ArrayList <Player> ListOfPlayers = new ArrayList<>();
        System.out.println("Выберите количество участников");
        Scanner scanner = new Scanner(System.in);
        int number_from_scanner = scanner.nextInt();
        //        Player exmpl = new Player("qsf", number_from_scanner);
        System.out.println("Напишите Фамилию Имя Отчество и ваш возраст.");
        for (int i = 1; i <=number_from_scanner; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Участник под номером" + (i + 1) + ":");
            System.out.println("ФИО: ");
            String fio = scanner1.nextLine();
            System.out.println("Ваш возраст");
            int age = scanner1.nextInt();
            ListOfPlayers.add(new Player(fio, age));
            // Запустить тест создания списка участников


        }
return ListOfPlayers;
    }


}
