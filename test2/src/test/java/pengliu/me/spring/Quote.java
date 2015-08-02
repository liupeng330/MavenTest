package pengliu.me.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    public String getType() {
        return type;
    }

    private String type;
    private Value value;
}
