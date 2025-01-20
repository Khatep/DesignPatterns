package decorator.components;

import decorator.Beverage;
import decorator.domain.Size;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    public Espresso(String description, BigDecimal cost, Size size) {
        super(description, cost, size);
    }
    @Override
    public BigDecimal cost() {
        return super.getBasicCost()
                .multiply(super.getSize().getValue());
    }

    @Override
    public String getDescription() {
        return super.description;
    }
}
