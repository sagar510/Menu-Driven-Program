import java.util.*;
class Menu
{
 public static void main(String args[])
  {
    
    Scanner obj=new Scanner(System.in);
    GCD obj1=new GCD();
    LargestOf3 obj2=new LargestOf3();
    int choice;

    System.out.println("MENU");
    System.out.println("1. Find GCD of two numbers");
    System.out.println("2. Find largest among 3");
 
    System.out.print("\nEnter your choice ");
    choice=obj.nextInt();

    switch(choice)
    {
       case 1: obj1.gcdmain();break;
       case 2: obj2.largeOf3main();
       case 3:System.exit(0);
    }
    
  }
}

class GCD
{
 public static void gcdmain()
 {
   Scanner obj=new Scanner(System.in);
   int res,a,b;
   System.out.println("Enter A:");
   a=obj.nextInt();
   System.out.println("Enter B:");
   b=obj.nextInt();
   res=gcdcal(a,b);
   System.out.println("GCD of A and B is "+res); 
 }

 public static int gcdcal(int x,int y)
 {
   while(x!=y)
   {
     if(x>y)
        return gcdcal(x-y,y);
     else
        return gcdcal(x,y-x);
   }
   return x;
 }
 
}


class LargestOf3
{
 public static void largeOf3main()
 {
   int p,q,r,large;
   Scanner obj=new Scanner(System.in);
   System.out.print("Enter 3 numbers");
   p=obj.nextInt();
   q=obj.nextInt();
   r=obj.nextInt();
   
    if(p>q)
     {
        if(p>r)
           large=p;
        else
          large=r;
     }
     else
     {
        if(q>r)
           large=q;
        else
            large=r;
     }

   System.out.println("Largest of 3 numbers is "+large);
 }
}