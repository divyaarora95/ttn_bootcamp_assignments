public class ReverseTest {
    public static void main(String[] args) {
        String str = "Dummy String";
        char ch[] = str.toCharArray();
        String reverseStr = "";
        for (int i = ch.length-1; i>=0; i--)
        {
            reverseStr = reverseStr+ch[i];
        }
        System.out.println("The Reversed String is: "+reverseStr);
        StringBuffer sb =   new StringBuffer(reverseStr);
        sb.delete(4, 9);
        System.out.println("Final String: "+sb);
    }
    
}
