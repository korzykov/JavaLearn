package TMSTasks.TheHuman;

public class Human implements Trousers, T_Shirt {
    private String name;
    private String t_shirtName;
    private String trousersName;

    public Human(String name, String t_shirtName, String trousersName) {
        this.name = name;
        this.t_shirtName = t_shirtName;
        this.trousersName = trousersName;
    }

    @Override
    public void takeOffT_Shirt() {
        System.out.println("Футболка снята " + t_shirtName);
    }

    @Override
    public void takeOnT_Shirt() {
        System.out.println("Футболка надета " + t_shirtName);
    }

    @Override
    public void takeOffTrousers() {
        System.out.println("Штаны сняты " + trousersName);
    }

    @Override
    public void takeOnTrousers() {
        System.out.println("Штаны надеты " + trousersName);
    }

    public void takeOffAllClothes() {
        takeOffTrousers();
        takeOffT_Shirt();
    }

    public void takeOnAllClothes() {
        takeOnTrousers();
        takeOnT_Shirt();
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Футболка: " + t_shirtName + ", Штаны: " + trousersName);
    }


}
