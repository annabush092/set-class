public class SetTests {

  public static void main(String[] args) {
    System.out.println("Running test file\n");

    // variables before tests
    MySet emptySet = new MySet();
    MySet oneSet = new MySet();
    oneSet.add(1);

    //run tests
    instantiatesEmptyClass(emptySet);
    isClassEmpty(emptySet);
    isClassNotEmpty(oneSet);
  }

// repeatable console responses
  private static void printTrue() {
    System.out.println("  Test Passed!\n");
  }
  private static void printFalse() {
    System.out.println("  Test Failed.\n");
  }

// tests
  private static void instantiatesEmptyClass(MySet emptySet) {
    System.out.println("Instantiates an empty class \n(Does the SetTests class have access to the MySet class)?");
    if(emptySet instanceof MySet) {
      printTrue();
    } else {
      printFalse();
    }
  }

  private static void isClassEmpty(MySet emptySet) {
    System.out.println("Does a class know if it is empty?");
    if(emptySet.isEmpty() == true) {
      printTrue();
    } else {
      printFalse();
    }
  }

  private static void isClassNotEmpty(MySet oneSet) {
    System.out.println("Does a class know if it is not empty?");
    if(oneSet.isEmpty() == false) {
      printTrue();
    } else {
      printFalse();
    }
  }

}
