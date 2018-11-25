package staticproxydemo;

/**
 * Created by Shen_potato on 2018/11/24.
 */
public class Student implements Person{
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void givemoney() {
        System.out.println( name+"捐献了"+money+"块钱");
    }
}
