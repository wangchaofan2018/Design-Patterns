package observer.event_bus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by wangchaofan on 2020/11/11.
 */
@Data
@AllArgsConstructor
public class Info {
    private String from;
    private String text;
    private String time;
}
