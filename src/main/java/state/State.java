package state;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by wangchaofan on 2020/11/19.
 */
@AllArgsConstructor
public enum State {
    SMALL(1, "小马力欧"),
    SUPPER(2, "超级马力欧"),
    CAPE(3, "斗篷马力欧"),
    FIRE(4, "喷火马力欧");

    public int code;
    public String desc;

    }
