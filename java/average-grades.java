// Compute average grades.

import java.util.ArrayList;

class GradeAnalyzer {
  
  public GradeAnalyzer() {}
  int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1) {
      System.out.println("No grades entered.");
      return 0;
    }
    else {
      int sum = 0;
        for (int grade : grades) {
          sum = sum + grade;
        }
    int average = sum/grades.size();
    System.out.println(average);
        return average;      
    }
  }
  
  public static void main(String[] args) {
  ArrayList<Integer> myClassroom = new ArrayList<Integer>();
  myClassroom.add(98);
  myClassroom.add(92);
  myClassroom.add(88);
  myClassroom.add(75);
  myClassroom.add(61);
  myClassroom.add(89);
  myClassroom.add(95);
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
    
  }
}
