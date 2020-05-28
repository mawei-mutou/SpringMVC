package pojo;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/5/25
 * time        : 20:42
 * description :
 */
public class Demo {


    private People peo;

    @Override
    public String toString() {
        return "Demo{" +
                "peo=" + peo +
                '}';
    }

    public People getPeo() {
        return peo;
    }

    public void setPeo(People peo) {
        this.peo = peo;
    }

    public Demo() {
    }

    public Demo(People peo) {
        this.peo = peo;
    }
}
