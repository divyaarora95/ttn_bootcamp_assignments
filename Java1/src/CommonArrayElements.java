public class CommonArrayElements {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {4, 5, 6, 7, 8, 1, 3};
        int len1 = array1.length;
        int len2 = array2.length;
            for(int i =0;i<len1;i++)
            {
                for(int j= 0;j<len2;j++)
                {
                    if(array1[i]==array2[j])
                    {
//                      printing common elements
                        System.out.println(array1[i]);
                    }
                }
            }
    }
}
