package decorator.components;

import decorator.Beverage;
import decorator.domain.Size;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    public HouseBlend(String description, BigDecimal basicCost, Size size) {
        super(description, basicCost, size);
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
