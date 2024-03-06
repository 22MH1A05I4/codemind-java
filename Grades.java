import java.util.*;
public class Grades{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int p=((a+b+c+d+e)*100)/500;
        if(p>=90)
        {
        System.out.println("Grade A");
        }
        else if(p<90 && p>=80)
        {
        System.out.println("Grade B");
        }
        else if(p<80 && p>=70)
        {
        System.out.println("Grade C");
        }
        else if(p<70 && p>=60)
        {
        System.out.println("Grade D");
        }
        else if(p<60 && p>=40)
        {
        System.out.println("Grade E");
        }
        else
        {
        System.out.println("Grade F");
        }
    }
}