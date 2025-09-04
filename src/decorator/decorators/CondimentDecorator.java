package decorator.decorators;

import decorator.components.Beverage;
import decorator.domain.enums.Size;
import lombok.Getter;

import java.math.BigDecimal;

public abstract class CondimentDecorator extends Beverage {

    @Getter
    private final Beverage beverage;

    protected CondimentDecorator(Beverage beverage, String description, BigDecimal cost) {
        super(description, cost, beverage.getSize());
        this.beverage = beverage;
    }
}
