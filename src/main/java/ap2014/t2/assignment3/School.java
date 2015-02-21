package ap2014.t2.assignment3;

import java.util.ArrayList;

/**
 * Created by acorn on 2/19/15.
 */
public class School {
  private final ArrayList<Student> students;
  private final ArrayList<Teacher> teachers;

  public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
    this.students = students;
    this.teachers = teachers;
  }

  public String getGradeLevel(int level){
    StringBuilder result = new StringBuilder();
     for (Student student : students) {
       if (student.getLevel() == level) {
         result.append(student);
         result.append('\n');
       }
    }
    return result.toString();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Faculty:\n");
    for (Teacher teacher : teachers) {
      result.append(teacher);
      result.append('\n');
    }
    result.append("\nStudent Body:\n");
    for (Student student : students) {
      result.append(student);
      result.append('\n');
    }
    return result.toString();
  }
}
