import java.util.*;
public class Vowel{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ab=sc.next().charAt(0);
        if(ab =='a' || ab =='e' || ab =='i' || ab =='o'|| ab =='u'||ab =='A' || ab =='E' || ab =='I' || ab =='O'|| ab =='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}