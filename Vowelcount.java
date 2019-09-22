import java.util.Scanner;
class Vowelcount

{
    public static void main(String[] args)
    {
        int i=0;
        int countVowel=0;
        int countVowel_A=0;
        int countVowel_E=0;
        int countVowel_I=0;
        int countVowel_O=0;
        int countVowel_U=0;
        System.out.print("Please Enter the string : ");
        Scanner sc = new Scanner(System.in);
       
        {
            String str = sc.next();
            if (str.equals("done"))
          
            i=0;
            while(i<str.length())
            {
                char ch = str.charAt(i);
                if(ch == 'a' || ch =='A')
                {
                    countVowel_A++;
                    countVowel++;
                }
                if(ch == 'e' || ch =='E')
                {
                    countVowel_E++;
                    countVowel++;
                }
                if(ch == 'i' || ch =='I')
                {
                    countVowel_I++;
                    countVowel++;
                }
                if(ch == 'o' || ch =='O')
                {
                    countVowel_O++;
                    countVowel++;
                }
                if(ch == 'u' || ch =='U')
                {
                    countVowel_U++;
                    countVowel++;
                }
                i++;
                
            }
        }
        System.out.println("A: " + countVowel_A);
        System.out.println("E: " + countVowel_E);
        System.out.println("I: " + countVowel_I);
        System.out.println("O: " + countVowel_O);
        System.out.println("U: " + countVowel_U);
        System.out.println("Number of vowels in strings are : " + countVowel);
    }


    
    
}