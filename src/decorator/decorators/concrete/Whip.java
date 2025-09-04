package decorator.decorators.concrete;

import decorator.components.Beverage;
import decorator.decorators.CondimentDecorator;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage, String description, BigDecimal cost) {
        super(beverage, description, cost);
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
