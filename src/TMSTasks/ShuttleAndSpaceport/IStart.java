package TMSTasks.ShuttleAndSpaceport;

public interface IStart {
    public default boolean checkTheSystem(Object x){
        if (!(x instanceof Shuttle)){
            return false;
        } else return true;
    }
    public default void startEngine() throws InterruptedException {
        for (int i = 10; i>=0; i--){
            System.out.println(i);
            Thread.sleep(800);
        }
    }


}
