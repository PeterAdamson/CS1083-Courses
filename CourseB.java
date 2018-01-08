//Authors: Peter Adamson, Tristen Tulkens

public class CourseB extends Course{

   public CourseB(String name, int credits, String level) {

      super(name, credits, level);
      setAssignmentBound(25);
      setMidTermBound(25);
      setFinalExamBound(50);

   }

   public float Calculate_Mark(float assignment, float lab, float midTerm, float finalExam) {

      return assignment+midTerm+finalExam;

   }



}
