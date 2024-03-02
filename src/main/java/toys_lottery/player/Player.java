package toys_lottery.player;

public class Player {

    private int pId;
    private String FIO;
    private int age;

    public Player (int pId, String FIO, int age){
        this.pId = pId;
        this.FIO = FIO;
        this.age = age;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
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
        return "pId: " + pId + " | FIO: " + FIO + " | Age: " + age;
    }

}
