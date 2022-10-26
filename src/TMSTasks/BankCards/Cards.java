package TMSTasks.BankCards;

abstract class Cards extends Bank{
    private int bankBrunchNumberGraduate;
    private String addressOfBrunchBankGraduate;
    private int lifeTimeCard;
    private String currency;

    public int getBankBrunchNumberGraduate() {
        return bankBrunchNumberGraduate;
    }

    public String getAddressOfBrunchBankGraduate() {
        return addressOfBrunchBankGraduate;
    }

    public int getLifeTimeCard() {
        return lifeTimeCard;
    }

    public String getCurrency() {
        return currency;
    }

    public Cards(String nameBank, int bankBrunchNumberGraduate, String addressOfBrunchBankGraduate, int lifeTimeCard, String currency) {
        super(nameBank);
        this.bankBrunchNumberGraduate = bankBrunchNumberGraduate;
        this.addressOfBrunchBankGraduate = addressOfBrunchBankGraduate;
        this.lifeTimeCard = lifeTimeCard;
        this.currency = currency;
    }


    public abstract void printInformationAboutCard();

}
