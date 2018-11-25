package dynamicproxydemo;

/**
 * Created by Shen_potato on 2018/11/24.
 * 需要代理的实际类
 */
public class Student implements Person {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void givemoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"捐献了50元");
    }
}
