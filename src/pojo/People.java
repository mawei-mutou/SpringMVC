package pojo;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/5/25
 * time        : 19:29
 * description :
 */
public class People {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
