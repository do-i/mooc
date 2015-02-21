package ap2014.t2.assignment3;

/**
 * Created by acorn on 2/19/15.
 */
public class Person {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return lastName + ", " + firstName;
  }
}
