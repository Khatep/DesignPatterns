package decorator.decorators.impl;

import decorator.Beverage;
import decorator.decorators.CondimentDecorator;
import decorator.domain.Size;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    protected Soy(Beverage beverage, String description, BigDecimal cost, Size size) {
        super(description, cost, size);
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return super.getBasicCost()
                .multiply(super.getSize().getValue())
                .add(this.getBeverage().cost());
    }
}
