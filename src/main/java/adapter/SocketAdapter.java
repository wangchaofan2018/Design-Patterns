package adapter;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class SocketAdapter implements DBSocketInterface{
    private GBSocketInterface gbSocket;

    public SocketAdapter(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerWithThreeHole() {
        System.out.println("添加适配器");
        gbSocket.powerWithTwoHole();
    }
}
