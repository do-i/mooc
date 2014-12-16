package codingbat;

/**
 * Created by acorn on 12/15/14.
 */
public class AnswerCell {
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) {
      return false;
    }
    return !isMorning || (isMorning && isMom) ;
  }
}
