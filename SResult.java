package one;
import java.util.*;

public class SResult
{
	public static void main(String[] args) 
	{

		Result r = new Result();
		r.dispalyResult();

	}

}

 class Result
 {
	 int English[] = new int[3];
	 int Physics[] = new int[3];;
	 int Math[] = new int[3];;
	 int Total[] = new int[3];
	 Scanner sc = new Scanner(System.in);
	 Result()
	 { 
	 for(int i=0;i<3;i++)
	 {
		System.out.println("Enter marks of subject English for Student"+(i+1));
		English[i] = sc.nextInt();
		System.out.println("Enter marks of subject Physics for Student"+(i+1));
		Physics[i] = sc.nextInt();
		System.out.println("Enter marks of subject Math for Student"+(i+1));
		Math[i] = sc.nextInt();
		Total[i] = English[i] + Physics[i] + Math[i];
	 }
	 }
	 
	 void dispalyResult()
	 {
		 for(int i=0;i<3;i++)
		 {
			 if(Total[i]>=180)
			 {
			     System.out.println("       Marks in English is : "+English[i]);
			     System.out.println("       Marks in Physics is : "+Physics[i]);
			     System.out.println("       Marks in Math is : "+Math[i]);
				 System.out.println("Total marks for the student "+(i+1)+ " is  : "+Total[i]+ " and he is passed with 1st Division");
			 }
			 if(Total[i]>=150 && Total[i]<180)
			 {
				 System.out.println("      Marks in English is : "+English[i]);
			     System.out.println("      Marks in English is : "+Physics[i]);
			     System.out.println("      Marks in English is : "+Math[i]);
				 System.out.println("Total marks for the student "+(i+1)+  " is  : "+Total[i]+ " and he is passed with 2nd Division"); 
			 }
			 
			   if(Total[i]>=102 && Total[i]<150)
			   {
				   System.out.println("      Marks in English is : "+English[i]);
				   System.out.println("      Marks in English is : "+Physics[i]);
				   System.out.println("      Marks in English is : "+Math[i]);
				   System.out.println("Total marks for the student "+(i+1)+  " is  : "+Total[i]+ " and he is has just passed");
			   }
			 if(Total[i]<102) 
			 {
				 System.out.println("      Marks in English is : "+English[i]);
			     System.out.println("      Marks in English is : "+Physics[i]);
			     System.out.println("      Marks in English is : "+Math[i]);
				 System.out.println("Total marks for the student "+(i+1)+  " is  : "+Total[i]+ " and he is has failed");
			 }
		 }
	 
	 }
 }
 
 
