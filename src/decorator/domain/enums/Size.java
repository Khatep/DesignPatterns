package decorator.domain.enums;

import lombok.Getter;
import java.math.BigDecimal;

@Getter
public enum Size {
    SMALL(new BigDecimal("1")),
    MEDIUM(new BigDecimal("1.2")),
    LARGE(new BigDecimal("1.4"));

    private final BigDecimal value;
    Size(BigDecimal value) {
        this.value = value;
    }
}
