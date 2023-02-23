import java.util.*;

class Errors {

  Scanner scan = new Scanner(System.in);

  void NumberError() throws NumberFormatException {

    System.out.print("\nEnter a value: ");
    String text = scan.next();
    int number = Integer.parseInt(text);
    System.out.println("Number: " + number);

  }

  void ArithmeticError() {
    try {

      System.out.print("\nEnter Age: ");
      int age = scan.nextInt();

      if (age < 18) {
        throw new ArithmeticException("[ERR]Age must be greater than 18");
        // throw new Exception("exception details");
      }
      // the below sout will only work if there is no exception, otherwise it the
      // program flow goes to the catch
      System.out.println("Age: " + age);

    } catch (ArithmeticException err) {
      System.out.println(err.getMessage());
    }
  }

  void ArrayError() {

    int array[] = { 10, 20, 30, 40, 50 };

    try {

      System.out.print("\nEnter the index: ");
      int index = scan.nextInt();

      System.out.print("\nEnter value: ");
      array[index] = scan.nextInt();

    } catch (ArrayIndexOutOfBoundsException err) {

      System.out.println(err.getMessage());

    } finally {

      System.out.print("\nArray is: ");

      for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
    }
  }
}

class ExceptionHandling {

  public static void main(String args[]) {

    Errors error = new Errors();

    try {
      error.NumberError();
    } catch (NumberFormatException err) {
      System.out.println(err);
    }

    error.ArithmeticError();
    error.ArrayError();
  }
}
