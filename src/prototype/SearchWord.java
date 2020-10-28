package prototype;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class SearchWord {
    private Long id;
    private String keyword;
    private Integer count;
    private Long updateTime;

    public Long getId() {
        return id;
    }

    public String getKeyword() {
        return keyword;
    }

    public Integer getCount() {
        return count;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
