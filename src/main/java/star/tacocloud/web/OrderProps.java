package star.tacocloud.web;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Component
@ConfigurationProperties("taco.order")
@Data
@Validated
public class OrderProps {
    /**
     * Sets the maximum number of orders to display in a list.
     */
    @Min(value = 5, message = "must be between 5 and 25")
    @Max(value = 25, message = "must be between 5 and 25")
    private int pageSize = 20;
}
