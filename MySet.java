public class MySet {

  private int length = 0;

  public boolean isEmpty() {
    if(length < 1) {
      return true;
    } else {
      return false;
    }
  }

  public void add(int n) {
    length++;
  }

}
