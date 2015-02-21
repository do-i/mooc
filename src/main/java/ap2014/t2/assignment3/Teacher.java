package ap2014.t2.assignment3;

/**
 * Created by acorn on 2/19/15.
 */
public class Teacher extends Person {
  private final String subject;

  public Teacher(String firstName, String lastName, String subject) {
    super(firstName, lastName);
    this.subject = subject;
  }

  @Override
  public String toString() {
    return super.toString() + "\n   Subject: " + subject;
  }
}
