package ap2014.t2.assignment3;

/**
 * Created by acorn on 2/19/15.
 */
public class HighSchoolStudent extends Student {
  private final double gpa;

  public HighSchoolStudent(String firstName, String lastName, int level, double gpa) {
    super(firstName, lastName, level);
    if (gpa < 0 || gpa > 5) {
      this.gpa = 0;
    } else {
      this.gpa = gpa;
    }
  }

  @Override
  public String toString() {
    return super.toString() + "\n   GPA: " + gpa;
  }
}
