package TMSTasks.BankCards;

public class StartTheSystemOfCards {
    public static void main(String[] args) {
        CreditCards alfaBank100day = new CreditCards("Alfa-Bank",149,"ул. Независимости 198, д.10",4,"Belarus rub","100 дней",39,"Если вы вернете деньг банку до 100 дней - процент не учитывается");
        alfaBank100day.printInformationAboutCard();

    }
}
