package strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by wangchaofan on 2020/11/12.
 */
@Data
@AllArgsConstructor
public class AlgRange {
    private long start;
    private long end;
    private ISortAlg sortAlg;

    public boolean inRange(long length) {
        if (start <= length && end > length) {
            return true;
        }
        return false;
    }

}
