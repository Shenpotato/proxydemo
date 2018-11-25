package staticproxydemo;

/**
 * Created by Shen_potato on 2018/11/24.
 */
public class Main {
    public static void main(String[] args) {
        Person shenpotato = new Student("Shenpotato",100);

        Person studentProxy = new StudentProxy((Student) shenpotato);

        studentProxy.givemoney();

    }
}
