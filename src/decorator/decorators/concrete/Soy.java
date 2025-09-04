package decorator.decorators.concrete;

import decorator.components.Beverage;
import decorator.decorators.CondimentDecorator;
import decorator.domain.enums.Size;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Soy extends CondimentDecorator {

    protected Soy(Beverage beverage, String description, BigDecimal cost) {
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
                .add(this.getBeverage().cost());
    }
}
