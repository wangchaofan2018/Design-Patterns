package expression;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/17.
 */

public class AlertRuleInterpreter {
    private Expression expression;

    // key1 > 100 && key2 < 1000 || key3 == 200
    public AlertRuleInterpreter(String ruleExpression) {
        //TODO:由你来完善
        expression = new OrExpression(ruleExpression);
    }

    //<String, Long> apiStat = new HashMap<>();
    //apiStat.put("key1", 103);
    //apiStat.put("key2", 987);
    public boolean interpret(Map<String, Long> stats) {
        //TODO:由你来完善
        return expression.interpret(stats);
    }

}
