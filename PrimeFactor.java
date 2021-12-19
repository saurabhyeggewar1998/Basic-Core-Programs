
import java.util.Scanner;
 class primeFactor
	 {
void printFact(int Num)
		 {
	for (int i=1;i<=Num;i++)
	{
		System.out.println(i+" ");
	}

		 }




   public static void main(String[] args){
      int Num=0;
      System.out.println("Enter an NUMBER");
      Scanner sc = new Scanner(System.in);
      Num = sc.nextInt();
      primeFactor obj =new  primeFactor();
	  obj.primeFactor(Num);
     
   }
}