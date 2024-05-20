import java.util.Scanner;

public class StudentGradeTracker {

	public static void main(String[] args) {
		System.out.println("------STUDENT GRADE TRACKER------");
		int[] grade=new int[5];
		System.out.println("Enter your Grades: ");
		Scanner input=new Scanner(System.in);
		
		int sum=0;
		for(int i=0;i<grade.length;i++) {
			grade[i]=input.nextInt();
			sum=sum+grade[i];
		}
		int max=0;
		 int min=grade[0];
	     for(int i=0;i<grade.length;i++) {
	    	 if (grade[i]>max) {
	    		 max=grade[i];
	    		 
	    	 }
	    	 
	    	 if(grade[i]<min) {
	    		 min=grade[i];
	    		
	    		 
	    	 }
	     }
	
		int average=sum/grade.length;
		System.out.println("Average: "+average);
		System.out.println("Highest Marks: "+max);
		System.out.println("Lowest Marks: "+min);



	}

}
