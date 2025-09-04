package decorator.decorators.concrete;

import decorator.components.Beverage;
import decorator.decorators.CondimentDecorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage, String description, BigDecimal cost) {
        super(beverage, description, cost, beverage.getSize());
    }

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + ", " + super.description;
    }

    @Override
    public BigDecimal cost() {
        return super.getBasicCost()
                .multiply(super.getSize().getValue())
                .add(super.getBeverage().cost());
    }
}
