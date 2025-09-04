package decorator.components;

import decorator.domain.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public abstract class Beverage {
    protected String description;
    protected BigDecimal basicCost;
    protected Size size;
    public abstract BigDecimal cost();
}
