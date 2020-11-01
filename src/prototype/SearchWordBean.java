package prototype;

public class SearchWordBean {
    private Long id;
    private String keyword;
    private Integer count;
    private Long updateTime;
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
