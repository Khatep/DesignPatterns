package decorator.decorators.impl;

import decorator.Beverage;
import decorator.decorators.CondimentDecorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage, String description, BigDecimal cost) {
        super(description, cost, beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + super.description;
    }

    @Override
    public BigDecimal cost() {
        return super.getBasicCost()
                .multiply(super.getSize().getValue())
                .add(beverage.cost());
    }
}
