package proxy;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class UserController {

    //依赖注入
    private LogService logService;

    /**
     * 如下两个方法 需要添加打点接口记录请求响应时间以及注册更新状态
     * 直接添加代码违反了单一职责原则 通过代理类来实现代码零侵入
     */

    public User login(String username,String password) {
        logService.print("登录");
        return new User();
    }

    public boolean register(String phoneNumber) {
        logService.print("注册");
        return false;
    }
}
