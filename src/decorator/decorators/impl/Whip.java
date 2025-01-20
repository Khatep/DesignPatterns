package decorator.decorators.impl;

import decorator.Beverage;
import decorator.decorators.CondimentDecorator;
import decorator.domain.Size;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage, String description, BigDecimal cost) {
        super(description, cost, beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return super.getBasicCost()
                .multiply(super.getSize().getValue())
                .add(this.getBeverage().cost());
    }
}
