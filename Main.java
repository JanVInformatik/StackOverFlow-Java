public class Main {
  public static void main(String[] args) {
    StackOverFlowRecursive(0);
  }

  static public int StackOverFlowRecursive(int x) {
    System.out.println(x);
    return StackOverFlowRecursive(x + 1);
  }
}
