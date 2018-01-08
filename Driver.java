//Authors: Peter Adamson, Tristen Tulkens

import java.util.Scanner;

public class Driver {

   public static void main(String[] args) {

      float assignment=0, lab=0, midTerm=0, finalExam=0;
      Scanner scan = new Scanner(System.in); 

      System.out.println("Please enter name of first course (has the lab component):");
      String name = scan.next();
      System.out.println("Please enter number of credit hours of first course (has the lab component):");
      int ch = scan.nextInt();
      System.out.println("Please enter level of first course (has the lab component):");
      String level = scan.next();
      CourseA courseA = new CourseA(name, ch, level);

      System.out.println("Please enter name of second course (no lab component):");
      name = scan.next();
      System.out.println("Please enter number of credit hours of second course (no lab component):");
      ch = scan.nextInt();
      System.out.println("Please enter level of second course (no lab component):");
      level = scan.next();
      CourseB courseB = new CourseB(name, ch, level);
  
      char status = 'y';

      while(status == 'y' || status == 'Y') {

         System.out.println("For which course would you like to add a grade?");
         String course = scan.next();

         while(!course.equals(courseA.getCourseName()) && !course.equals(courseB.getCourseName())) {
            System.out.println("Please enter a valid course");
            course = scan.next();
         }

         Course tempCourse;
         if(course.equals(courseA.getCourseName())) {
            tempCourse = courseA;
         }
         else {
            tempCourse = courseB;
         }

         System.out.printf("What is the student's Assignment grade (between 1 and %d)?%n", tempCourse.getAssignmentBound());

         float temp = scan.nextFloat();

         while(temp<1 || temp>tempCourse.getAssignmentBound()){
            System.out.println("Please enter a number within the parameters");
            temp=scan.nextFloat();
         }
         assignment = temp;

         System.out.printf("What is the student's midTerm grade (between 1 and %d)?%n", tempCourse.getMidTermBound());
         temp = scan.nextFloat();

         while(temp<1 || temp>tempCourse.getMidTermBound()){
            System.out.println("Please enter a number within the parameters");
            temp=scan.nextFloat();
         }
         midTerm = temp;

         System.out.printf("What is the student's Final Exam grade (between 1 and %d)?%n", tempCourse.getFinalExamBound());
         temp = scan.nextFloat();

         while(temp<1 || temp>tempCourse.getFinalExamBound()){
            System.out.println("Please enter a number within the parameters");
            temp=scan.nextFloat();
         }
         finalExam = temp;

         float finalMark;
         if(tempCourse.getCourseName().equals(courseA.getCourseName())) {
	    System.out.printf("What is the student's Lab grade (between 1 and %d)?%n", courseA.getLabBound());
	    temp = scan.nextFloat();

	    while(temp<1 || temp>courseA.getLabBound()){
	       System.out.println("Please enter a number within the parameters");
	       temp=scan.nextFloat();
	    }
	 lab = temp;
         finalMark = courseA.Calculate_Mark(assignment, lab, midTerm, finalExam);
         }
         else {
            finalMark = courseB.Calculate_Mark(assignment, lab, midTerm, finalExam);
         }

         System.out.printf("Final mark for %s, course level %s, worth %d credit hours: %.2f%n", tempCourse.getCourseName(), tempCourse.getCourseLevel(), tempCourse.getCourseCredits(), finalMark);

         System.out.println("Add another student? (y/n)");
         status = scan.next().charAt(0);
      }
        
   }
}
