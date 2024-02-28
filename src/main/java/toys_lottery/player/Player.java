package toys_lottery.player;

public class Player {
    private String FIO;
    private int age;

    public Player (String FIO, int age){
        this.FIO = FIO;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            System.out.println("Могут участвовать только совершеннолетние!");
            // Запуситить программу снова.
        } else if (age > 90) {

            System.out.println("Отлично, что вы снами!");

        } else {
            this.age = age;
        }
    }
    public String toString() {
        return "FIO: " + FIO + " Age: " + age;
    }

}
