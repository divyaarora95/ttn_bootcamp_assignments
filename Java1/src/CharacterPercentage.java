public class CharacterPercentage {
    public static void main(String[] args) {
        String str = "DSDHJifhcdbsb_+1325sfg";
        int uppCase = 0, lowCase = 0, digits = 0, spcCharacters = 0,len = str.length();
        for(int k =0; k < str.length(); k++)
        {
            //uppercase
            if(Character.isUpperCase(str.charAt(k)))
            {
                uppCase++;
            }
            //lowercase
            if(Character.isLowerCase(str.charAt(k)))
            {
                lowCase++;
            }
            //            uppercase
            if(Character.isDigit(str.charAt(k)))
            {
                digits++;
            }
    
            if (!(Character.isDigit(str.charAt(k))) && !(Character.isAlphabetic(str.charAt(k))))
            {
                spcCharacters++;
            }
    
        }
        
        System.out.println("the number of uppercase characters are "+uppCase+" with % equal to "+(((float)uppCase/len)*100));
        System.out.println("the number of lowercase characters are "+lowCase+" with % equal to "+(((float)lowCase/len)*100));
        System.out.println("the number of digits are "+digits+" with % equal to "+(((float)digits/len)*100));
        System.out.println("the number of special characters are "+spcCharacters+" with % equal to "+(((float)spcCharacters/len)*100));
    }
}
