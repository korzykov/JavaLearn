package TMSTasks.ShuttleAndSpaceport;

public class RUN {
    public static void main(String[] args) throws InterruptedException {
        Spaceport nasaSpace1 = new Spaceport("Victory");
        Shuttle spaceX = new Shuttle("Falcon X");
        Shuttle nasaM = new Shuttle("Apollo 11");

        if (nasaSpace1.start(spaceX)) {
            spaceX.start();
        }
        if (nasaSpace1.start(nasaM)) {
            nasaM.start();
        }

        nasaSpace1.displayInfo();

    }
}
