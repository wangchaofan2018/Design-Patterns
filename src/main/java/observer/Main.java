package observer;

/**
 * Created by wangchaofan on 2020/11/5.
 */
public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new ChinaDailyNewspaper();
        newspaper.registerObserver(new CompanyObserver("快看漫画"));
        newspaper.registerObserver(new HumanObserver("阿飞"));
        newspaper.notifyObservers("美国大选，拜登获胜。");
    }
}
