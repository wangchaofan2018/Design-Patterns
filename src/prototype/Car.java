package prototype;

/**
 * Created by wangchaofan on 2020/11/4.
 */
public class Car implements Cloneable{
    /**
     * 品牌
     */
    private String band;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 型号
     */
    private String model;

    /**
     * 厂家
     */
    private String manufacturer;

    /**
     * 车辆长度
     */
    private int length;

    /**
     * 车辆宽度
     */
    private int width;

    /**
     * 车辆高度
     */
    private int high;

    /**
     * 价格
     */
    private float price;



    public void setWidth(int width) {
        this.width = width;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "band='" + band + '\'' +
//                ", model='" + model + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", length=" + length +
//                ", width=" + width +
//                ", high=" + high +
//                ", price=" + price +
//                '}';
//    }
//
//    public Car(String band, int high, int length, int width, String manufacturer, String model, float price) {
//        //模拟初始化过程耗时较长的
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.band = band;
//        this.high = high;
//        this.length = length;
//        this.width = width;
//        this.manufacturer = manufacturer;
//        this.model = model;
//        this.price = price;
//    }

    /**
     * 车主
     */
    private Driver driver;

    public Car(String band, int high, int length, int width, String manufacturer, String model, float price,Driver driver) {
        //模拟初始化过程耗时较长的
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.band = band;
        this.high = high;
        this.length = length;
        this.width = width;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.driver = driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return this.driver;
    }


    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", high=" + high +
                ", price=" + price +
                ", driver=" + driver +
                '}';
    }
}
