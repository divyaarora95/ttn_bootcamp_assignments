import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        NewApplication newApplication = new NewApplication();
        String str = "Divya";
        System.out.println(StringUtils.lowerCase(str));
    }
}
