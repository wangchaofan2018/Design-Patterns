package prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class CacheService {
    private HashMap<String, SearchWord> currentSearchCaches = new HashMap<>();
    private long lastUpdateTime = -1;

//    /**
//     * 会出现中间状态 可能a数据修改 已更新到缓存 但是b数据修改还未更新到缓存 存在数据不一致的中间问题，也可能在插入数据的过程中出现无法读取数据的问题
//     */
//    public void refresh() {
//        List<SearchWord> searchWordList = getSearchWords(lastUpdateTime);
//        Long maxNewUpdateTime = lastUpdateTime;
//        for (SearchWord word : searchWordList) {
//            if (word.getUpdateTime() > maxNewUpdateTime) {
//                maxNewUpdateTime = word.getUpdateTime();
//            }
//            if (currentSearchCaches.containsKey(word.getKeyword())) {
//                SearchWord oldSearchWord = currentSearchCaches.get(word.getKeyword());
//                oldSearchWord.setCount(word.getCount());
//                oldSearchWord.setUpdateTime(word.getUpdateTime());
//            } else {
//                currentSearchCaches.put(word.getKeyword(), word);
//            }
//        }
//    }

    /**
     * 原型模式 复用无需更新的个体数据 避免中间状态
     */
    public void refresh() {
        HashMap<String, SearchWord> newSearchCaches = (HashMap<String, SearchWord>) currentSearchCaches.clone();
        Long maxNewUpdateTime = lastUpdateTime;
        List<SearchWord> searchWordList = getSearchWords(lastUpdateTime);
        for (SearchWord word : searchWordList) {
            if (word.getUpdateTime() > lastUpdateTime) {
                lastUpdateTime = word.getUpdateTime();
            }
            if (newSearchCaches.containsKey(word.getKeyword())) {
                SearchWord oldSearchWord = newSearchCaches.get(word.getKeyword());
                oldSearchWord.setCount(word.getCount());
                oldSearchWord.setUpdateTime(word.getUpdateTime());
            } else {
                newSearchCaches.put(word.getKeyword(), word);
            }
        }
        lastUpdateTime = maxNewUpdateTime;
        currentSearchCaches = newSearchCaches;
    }

    //从数据库获取数据
    public List<SearchWord> getSearchWords(Long lastUpdateTime) {
        return new ArrayList<>();
    }
}
