package expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/18.
 */
public class OrExpression implements Expression {
    List<Expression> list = new ArrayList<>();
    public OrExpression(String string) {
        String[] elements = string.trim().split("\\|\\|");
        for (String element : elements) {
            list.add(new AndExpression(element));
        }
    }
    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : list) {
            if (expression.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}
