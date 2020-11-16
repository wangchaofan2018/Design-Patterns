package principle.ISP;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Pigeon extends Bird {
    private Long id;

    public Pigeon(Long id) {
        this.id = id;
    }

    @Override
    public void fly() {
        System.out.println("fly in the sky");
    }
}
