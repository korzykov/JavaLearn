package TMSTasks.BankCards;

public class CreditCards extends Cards{
    private String nameCardsProgram;
    private int percentagePerAnnum;
    private String additionalBonus;

    public CreditCards(String nameBank, int bankBrunchNumberGraduate, String addressOfBrunchBankGraduate, int lifeTimeCard, String currency, String nameCardsProgram, int percentagePerAnnum, String additionalBonus) {
        super(nameBank, bankBrunchNumberGraduate, addressOfBrunchBankGraduate, lifeTimeCard, currency);
        this.nameCardsProgram = nameCardsProgram;
        this.percentagePerAnnum = percentagePerAnnum;
        this.additionalBonus = additionalBonus;
    }

    @Override
    public void printInformationAboutCard() {
        System.out.println("Название банка: " + super.getNameBank() + ", Номер отделения: №" + super.getBankBrunchNumberGraduate()+ ", Адрес отделения банка: " + super.getAddressOfBrunchBankGraduate() + ", срок службы карточки: " + super.getLifeTimeCard() + " года, валюта карты: "+ super.getCurrency()+", Название карты: "+ nameCardsProgram+ ", Процент годовых: " + percentagePerAnnum + "%, Бонусное условие: "  + additionalBonus +".");
    }
}
