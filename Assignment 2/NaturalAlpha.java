public class NaturalAlpha
{
  public static void main(String[] args)
  {
    int i;
    for(i=1;i<=50;i++) // ERROR in logic. abc and xyz are interchanged
    {
     if(i%3==0)
     {
      if(i%5==0)
       System.out.print("abcxyz ");
      else
       System.out.print("xyz ");
     }
     else if(i%5==0)
      System.out.print("abc ");
     else
       System.out.print(i+" ");
    }
    System.out.println();
   }
}
