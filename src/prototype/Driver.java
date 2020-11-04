package prototype;

/**
 * Created by wangchaofan on 2020/11/4.
 */
public class Driver {
    private String name;
    private String phone_number;

    public Driver(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
