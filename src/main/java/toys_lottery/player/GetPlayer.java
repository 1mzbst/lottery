package toys_lottery.player;

import java.util.Scanner;

public class GetPlayer {
    public static Player getPlayer (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите количество участников");
        int number_from_scanner = scanner.nextInt();
        int test2 = scanner.nextInt();
//        Player exmpl = new Player("qsf", number_from_scanner);
        System.out.println("Напишите Фамилию Имя Отчество и ваш возраст.");
        for (int i = 0; i <=number_from_scanner; i++) {
            System.out.println("Участник под номером" + (i + 1) + ":");

            // Дописать запись игрока
        }
return exmpl;
    }
}
