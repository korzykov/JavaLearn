package TMSTasks.BankCards;
// Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.
public abstract class Bank {
    private String nameBank;

    public String getNameBank() {
        return nameBank;
    }

    public Bank(String nameBank) {
        this.nameBank = nameBank;
    }

}
