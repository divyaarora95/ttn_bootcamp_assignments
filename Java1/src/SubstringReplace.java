public class SubstringReplace {
    public static void main(String[] args) {
        String str = "This too shall fail";
        System.out.println("Original String: "+str);
        String replacedStr = str.replace("fail", "pass");
        System.out.println("String with replaced substring is: "+replacedStr);
    }
}