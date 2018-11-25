package dynamicproxydemo;

/**
 * Created by Shen_potato on 2018/11/24.
 */
public class MonitorUnit {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static  void start(){
        threadLocal.set(System.currentTimeMillis());
    }

    public static void finish(String methoName){
        long finishTime= System.currentTimeMillis();
        System.out.println(methoName+"方法耗时"+(finishTime-threadLocal.get())+"ms");
    }


}
