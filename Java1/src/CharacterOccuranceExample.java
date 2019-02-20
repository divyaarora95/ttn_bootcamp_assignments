public class CharacterOccuranceExample {
    public static void main(String[] args) {
        String str = "Occasion";
        int len = str.length();
        String replaced_str = str.replaceAll("c", "");
        int replaced_length = replaced_str.length();
        int difference = len - replaced_length;
        System.out.println("the number of times 'c' occured  is "+difference);
    
    }
    
}
