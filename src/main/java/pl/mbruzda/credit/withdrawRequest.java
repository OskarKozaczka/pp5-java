package pl.mbruzda.credit;

import java.math.BigDecimal;

public class withdrawRequest {
    private final String card1;
    private final BigDecimal valueOf;

    public withdrawRequest(String card1, BigDecimal valueOf) {
        this.card1 = card1;
        this.valueOf = valueOf;
    }

    public String getCard1() {
        return card1;
    }

    public BigDecimal getValueOf() {
        return valueOf;
    }
}
