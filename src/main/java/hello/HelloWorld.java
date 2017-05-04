package hello;
import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("Hello GitHub");
    System.out.println("The Current Local time is in UTC standard is: "+ currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
