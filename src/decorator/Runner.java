package decorator;

import decorator.components.concrete.Espresso;
import decorator.decorators.concrete.Mocha;
import decorator.decorators.concrete.Whip;
import decorator.components.Beverage;
import decorator.domain.enums.Size;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

@Slf4j
public class Runner {
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
