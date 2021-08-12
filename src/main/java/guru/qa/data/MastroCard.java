package guru.qa.data;

import static guru.qa.data.Country.RU;
import static guru.qa.data.PaymentSystem.MAESTRO;

public class MastroCard extends Card {
    public MastroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
