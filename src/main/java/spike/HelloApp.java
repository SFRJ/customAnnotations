package spike;

public class HelloApp {
//

    public static void main(String[] args) {
        HelloApp helloApp = new HelloApp();
        helloApp.work();
    }

    @HelloAnnotation
    public void work() {
        System.out.println("Hello world!");
    }
}
