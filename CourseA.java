//Authors: Peter Adamson, Tristen Tulkens

public class CourseA extends Course{

   private int labBound=10;

   public CourseA(String name, int credits, String level) {

      super(name, credits, level);
      setAssignmentBound(10);
      setMidTermBound(20);
      setFinalExamBound(60);

   }

   public float Calculate_Mark(float assignment, float lab, float midTerm, float finalExam) {

      return assignment+lab+midTerm+finalExam;

   }

   public int getLabBound() {

      return labBound;

   }



}
