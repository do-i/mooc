package ap2014.t2.lesson5;

/**
 * Created by acorn on 1/19/15.
 */
public class Student {
  private static int curStudentId = 1;
  private String firstName;
  private String lastName;
  private int gradeLevel;
  private double gpa;
  private int studentId;

  public Student() {
    firstName = "None";
    lastName = "None";
    gradeLevel = 0;
    gpa = 0.0;
    studentId = curStudentId++;
  }

  public Student(String firstName, String lastName, int gradeLevel, double gpa) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gradeLevel = gradeLevel > 0 && gradeLevel <= 12 ? gradeLevel : 0;
    this.gpa = gpa > 0.0 && gpa < 4.5 ? gpa : 0.0;
    studentId = curStudentId++;
  }

  @Override
  public String toString() {
    return lastName + ", " + firstName + "\nGPA: " + gpa + "\nGrade Level: " + gradeLevel + " id # " + studentId;
  }
}
