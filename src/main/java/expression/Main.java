package expression;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/17.
 */
public class Main {
    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 130 || key4 == 87";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1", 101l);
        stats.put("key3", 121l);
        stats.put("key4", 88l);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }
}
