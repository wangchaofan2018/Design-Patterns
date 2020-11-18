package expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/18.
 */
public class AndExpression implements Expression {
    List<Expression> list = new ArrayList<>();

    public AndExpression(String str) {
        String[] elements = str.trim().split("&&");
        for (String element : elements) {
            if (element.contains(">")) {
                list.add(new GreaterExpression(element));
            } else if (element.contains("<")) {
                list.add(new LessExpression(element));
            } else if (element.contains("==")) {
                list.add(new EquelExpression(element));
            } else {
                throw new RuntimeException("can not accept expression");
            }
        }
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : list) {
            if (!expression.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}
