import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2==bean? "Они один объект":"это разные объекты");
        Cat cat1=(Cat)applicationContext.getBean("cat");
        Cat cat2=(Cat)applicationContext.getBean("cat");
        System.out.println(cat1==cat2? "Они один объект":"это разные объекты");
    }
}