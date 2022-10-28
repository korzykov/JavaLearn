package TMSTasks.ShuttleAndSpaceport;

public class Spaceport implements IStart{
    static int countRocket;
    private String nameSpaceport;

    public Spaceport(String nameSpaceport) {
        this.nameSpaceport = nameSpaceport;
    }

    boolean start(Object x) throws InterruptedException {
        if (!checkTheSystem(x)){
            System.out.println("Предстартовая проверка провалена. Данный аппарат " + x.toString() + " не является шатлом");
            return false;
        } else {
            System.out.println("Запуск двигателя " + x.toString() + ". Обратный отсчёт");
            Thread.sleep(1000);
            startEngine();
            return true;
        }
    }
    public void displayInfo(){
        System.out.println("Название космодрома: " + nameSpaceport + ", количество выпущенных кораблей: " + this.countRocket);
    }

}