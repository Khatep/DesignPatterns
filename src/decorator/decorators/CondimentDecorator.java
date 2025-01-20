package decorator.decorators;

import decorator.Beverage;
import decorator.domain.Size;

import java.math.BigDecimal;

public abstract class CondimentDecorator extends Beverage {
    protected CondimentDecorator(String description, BigDecimal cost, Size size) {
        super(description, cost, size);
    }
}
