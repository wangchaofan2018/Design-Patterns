package adapter;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class Main {
    public static void main(String[] args) {
        GBSocketInterface gbSocket = new GBSocket();
        GermanyHotel hotel = new GermanyHotel();
        hotel.setDbSocket(new SocketAdapter(gbSocket));
        hotel.charge();
    }
}
