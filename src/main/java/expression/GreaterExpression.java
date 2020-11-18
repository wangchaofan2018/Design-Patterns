package expression;

import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/18.
 */
public class GreaterExpression implements Expression {
    private String key;
    private Long value;

    public GreaterExpression(String str) {
        String[] elements = str.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].equals(">")) {
            throw new RuntimeException("Expression is invalid");
        } else {
            key = elements[0];
            value = Long.valueOf(elements[2]);
        }
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (stats.containsKey(key)) {
            return stats.get(key) > value;
        }
        return false;
    }
}
