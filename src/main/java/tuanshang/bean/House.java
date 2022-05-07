package tuanshang.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties(prefix = "house")
public class House {
    private String name;
    private Object year;
    private Map<String, List<Car>> container;

}
