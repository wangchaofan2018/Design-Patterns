package adapter;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class GermanyHotel {
    private DBSocketInterface dbSocket;

    public void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        System.out.println("提供三孔插座");
        dbSocket.powerWithThreeHole();
    }
}
