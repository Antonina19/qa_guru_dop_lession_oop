package guru.qa;

import guru.qa.data.Card;
import guru.qa.data.UnionPayCard;

import java.util.ArrayList;
import java.util.List;

import static guru.qa.data.Country.RU;

public class Main {
    public static void main(String[] args) {
        invoke(new UnionPayCard());
        List<String> aList = new ArrayList<>();
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println("Current balance: " + card.getBalance());
    }
}
