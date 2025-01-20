package decorator;

import decorator.components.Espresso;
import decorator.decorators.impl.Mocha;
import decorator.decorators.impl.Whip;
import decorator.domain.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
@Getter
@Setter
public abstract class Beverage {
    protected String description;
    protected BigDecimal basicCost;
    protected Size size;
    public abstract BigDecimal cost();
}


@Slf4j
class Runner {
    static Logger logger = Logger.getLogger(Runner.class.getName());
    public static void main(String[] args) {
        Beverage espressoWithMochaAndWhip = new Espresso("Tasty espresso", new BigDecimal(1500), Size.LARGE);
        espressoWithMochaAndWhip = new Mocha(espressoWithMochaAndWhip, "Mocha", new BigDecimal(200));
        espressoWithMochaAndWhip = new Whip(espressoWithMochaAndWhip, "Whip", new BigDecimal(300));

        String orderDescription = espressoWithMochaAndWhip.getDescription();
        BigDecimal finalCost = espressoWithMochaAndWhip.cost();
        logger.log(Level.INFO, "Order description: {0}, Final cost: {1}", new Object[] {orderDescription, finalCost});
    }
}
