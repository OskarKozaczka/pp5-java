package pl.mbruzda.credit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BlaTest {

    @Test
    public void itHandlesMultipleCardWithdraws(){
        String card1 = thereIsCardWithLimit(1000);
        String card2 = thereIsCardWithLimit(2000);

        CardApi cardApi = thereIsCardApi();

        cardApi.handleWithdraw(card1, BigDecimal.valueOf(500));
        cardApi.handleWithdraw(card2, BigDecimal.valueOf(1000));

        cardBalanceEquals(card1, 500);
        cardBalanceEquals(card2, 1000);
    }

    private CardApi thereIsCardApi() {
    }

    private String thereIsCardWithLimit(int i) {
    }

    private void cardBalanceEquals(String card1, int i) {
    }
}
