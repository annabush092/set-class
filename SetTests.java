public class SetTests {

  public static void main(String[] args) {
    System.out.println("Running test file\n");
    instantiatesEmptyClass();
    isClassEmpty();
  }

  private static MySet emptySet = new MySet();

  private static void printTrue() {
    System.out.println("  Test Passed!\n");
  }
  private static void printFalse() {
    System.out.println("  Test Failed.\n");
  }

  private static void instantiatesEmptyClass() {
    System.out.println("Instantiates an empty class \n(Does the SetTests class have access to the MySet class)?");
    if(emptySet instanceof MySet) {
      printTrue();
    } else {
      printFalse();
    }
  }

  private static void isClassEmpty() {
    System.out.println("Does a class know if it is empty?");
    if(emptySet.length == 0) {
      printTrue();
    } else {
      printFalse();
    }
  }

}
