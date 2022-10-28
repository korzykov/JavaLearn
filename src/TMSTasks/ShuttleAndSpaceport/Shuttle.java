package TMSTasks.ShuttleAndSpaceport;

public class Shuttle implements IStart{
    private String nameShuttle;

    public Shuttle(String nameShuttle) {
        this.nameShuttle = nameShuttle;
    }
    public void start() throws InterruptedException {
        if ((int)(Math.random()*10) > 3){
            System.out.println("Двигатели " + nameShuttle + " запущены. Все системы в норме");
            Thread.sleep(1000);
            System.out.println("Старт " + nameShuttle);
            Spaceport.countRocket++;
            Thread.sleep(3000);

        } else {
            System.out.println("Ошибка запуска двигателей");
            Thread.sleep(3000);
        }
    }

    @Override
    public String toString() {
        return nameShuttle;
    }
}
