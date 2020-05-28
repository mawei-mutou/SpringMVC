package pojo;

import java.util.List;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/5/25
 * time        : 20:51
 * description :
 */
public class Demo02 {
    private List<People> peo;

    @Override
    public String toString() {
        return "Demo02{" +
                "peo=" + peo +
                '}';
    }

    public List<People> getPeo() {
        return peo;
    }

    public void setPeo(List<People> peo) {
        this.peo = peo;
    }

    public Demo02() {
    }

    public Demo02(List<People> peo) {
        this.peo = peo;
    }
}
