import java.util.logging.Level;
import java.util.logging.Logger;

public class Main08 {

    public  void method1() {
        final Logger logger  = Logger.getLogger(Main08.class.getName());
        try {
            method2();
            logger.log(Level.INFO, "learn Exc");
            System.out.println("learning exceptions");
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "hi");
            logger.log(Level.INFO, "hi");

        }
            finally {

            System.out.println("almost always running");
        }
        System.out.println("im hardworking student");
    }
//TODO сохранение в определенный файл
    public  void method2() {
        method3();
        System.out.println("im method2");
    }

    public  void method3() {

            throw new RuntimeException();


    }

    public static void main(String[] args) {
       Main08 a =  new Main08();
       a.method1();



    }
}
