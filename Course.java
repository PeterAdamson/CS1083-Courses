//Authors: Peter Adamson, Tristen Tulkens

public abstract class Course {

   private String courseName;
   private int courseCredits;
   private String courseLevel;
   private int assignmentBound;
   private int midTermBound;
   private int finalExamBound;
   
   public Course(String name, int credits, String level) {

      courseName = name;
      courseCredits = credits;
      courseLevel = level;

   }

   public abstract float Calculate_Mark(float assignment, float lab, float midTerm, float finalExam);

   public String getCourseName() {

      return courseName;
 
   }

   public int getCourseCredits() {

      return courseCredits;

   }

   public String getCourseLevel() {

      return courseLevel;

   }

   public void setAssignmentBound(int n) {

      assignmentBound = n;

   }

   public void setMidTermBound(int n) {

      midTermBound = n;

   }

   public void setFinalExamBound(int n) {

      finalExamBound = n;

   }

   public int getAssignmentBound() {

      return assignmentBound;

   }

   public int getMidTermBound() {

      return midTermBound;

   }

   public int getFinalExamBound() {

      return finalExamBound;

   }




}
