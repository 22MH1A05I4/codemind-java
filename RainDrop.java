import java.util.*;
public class RainDrop{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0 && a%5!=0 && a%7!=0){
            System.out.println("Pling");
        }
        else if(a%5==0 && a%3!=0 && a%7!=0)
        {
            System.out.println("Plang");
        }
        else if(a%7==0 && a%3!=0 && a%5!=0)
        {
            System.out.println("Plong");
        }
        else if(a%3==0 && a%5==0 && a%7!=0)
        {
            System.out.println("PlingPlang");
        }
        else
        {
            System.out.println(a);
        }
    }
}