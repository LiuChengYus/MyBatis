package cn.happy.day.service;

/**
 * Created by LY on 2017/9/28.
 */
public class HappySpring {
    private String info;
    private int age;

    @Override
    public String toString() {
        return "HappySpring{" +
                "info='" + info + '\'' +
                ", age=" + age +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  pring(){
        System.out.println("hello"+info);
    }
}
