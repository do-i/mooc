package ap2014.t2.assignment3;

/**
 * Created by acorn on 2/19/15.
 */
public class Student extends Person {
  private static int nextStudentId = 1;
  private final int studentId;
  private final int level;

  public Student(String firstName, String lastName, int level) {
    super(firstName, lastName);
    if (level < 0 || level > 12) {
      this.level = 0;
    } else {
      this.level = level;
    }
    studentId = nextStudentId++;
  }

  public int getLevel() {
    return level;
  }

  @Override
  public String toString() {
    return super.toString() + "\n   Grade Level: " + level + "\n   ID #: " + studentId;
  }
}
