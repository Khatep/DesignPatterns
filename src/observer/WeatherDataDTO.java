package observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDataDTO {
    private float temperature;
    private float humidity;
    private float pressure;
    private float heatindex;
}
