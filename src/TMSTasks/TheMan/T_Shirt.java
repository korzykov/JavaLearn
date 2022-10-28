package TMSTasks.TheMan;

public interface T_Shirt {
    default void takeOffT_Shirt() {
        System.out.println("Футболка снята");
    }
    default void takeOnT_Shirt() {
        System.out.println("Футболка надета");
    }
}
