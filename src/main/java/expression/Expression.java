package expression;

import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/18.
 */
public interface Expression {

    boolean interpret(Map<String, Long> stats);
}
