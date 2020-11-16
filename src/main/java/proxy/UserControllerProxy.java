package proxy;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class UserControllerProxy extends UserController {
    private LogService logService;

    public UserControllerProxy() {
        this.logService = new LogService();
    }

    @Override
    public boolean register(String phoneNumber) {
        boolean flag = super.register(phoneNumber);
        logService.print("注册状态:"+flag);
        return flag;
    }

    @Override
    public User login(String username, String password) {
        long startTimeStamp = System.currentTimeMillis();
        User user = super.login(username,password);
        long endTimeStamp = System.currentTimeMillis();
        logService.print("开始时间:" + startTimeStamp + ". 结束时间:" + endTimeStamp + ". 总时间:" + (endTimeStamp - startTimeStamp));
        return user;
    }

}
