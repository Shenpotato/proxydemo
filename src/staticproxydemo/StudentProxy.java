package staticproxydemo;

/**
 * Created by Shen_potato on 2018/11/24.
 */
public class StudentProxy implements Person{

    Student student;

    public StudentProxy(Student student) {
        if(student.getClass()==Student.class){
            this.student = student;
        }
    }

    @Override
    public void givemoney() {
        student.givemoney();
    }
}
