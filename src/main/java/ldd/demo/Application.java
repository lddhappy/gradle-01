package ldd.demo;

/**
 * Created by liudongdong on 2016/10/8.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello,Gradle");
        try {
            System.in.read();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
