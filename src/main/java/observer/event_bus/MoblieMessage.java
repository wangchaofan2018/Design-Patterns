package observer.event_bus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by wangchaofan on 2020/11/11.
 */
@Data
public class MoblieMessage extends Info {
    public MoblieMessage(String from, String text, String time, String mobileNumber) {
        super(from, text, time);
        this.mobileNumber = mobileNumber;
    }
    private String mobileNumber;
}
