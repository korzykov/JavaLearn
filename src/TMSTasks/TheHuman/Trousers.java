package TMSTasks.TheHuman;

public interface Trousers {
    default void takeOffTrousers() {
        System.out.println("Штаны сняты");
    }
    default void takeOnTrousers() {
        System.out.println("Штаны надеты");
    }

}
