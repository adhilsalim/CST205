import java.util.*;

class DList {

    static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int element;

        while (true) {
            System.out.print("\nSelect an operation: \n");
            System.out.print(
                    "\n1.Add element to List" +
                            "\n2.Delete from front" +
                            "\n3.Delete from end" +
                            "\n4.Delete from a position" +
                            "\n5.Display List" +
                            "\n6.Exit" +
                            "\n\nEnter an operation number: "

            );

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    // Add element to list
                    System.out.print("\nEnter element to add: ");
                    element = scan.nextInt();

                    list.add(element);
                    System.out.println("[" + element + " added to list]");

                    display();
                    break;
                case 2:
                    // Delete from front
                    try {
                        element = list.getFirst();
                        list.removeFirst();
                        System.out.println("[" + element + " deleted from list]");
                        display();
                    } catch (NoSuchElementException e) {
                        System.out.println("[List is empty]");
                    }
                    break;
                case 3:
                    // Delete from end
                    try {
                        element = list.getLast();
                        list.removeLast();
                        System.out.println("[" + element + " deleted from list]");
                        display();
                    } catch (NoSuchElementException e) {
                        System.out.println("[List is empty]");
                    }
                    break;
                case 4:
                    // Delete from a position
                    System.out.print("\nEnter position: ");
                    int position = scan.nextInt();

                    try {
                        element = list.get(position - 1);
                        list.remove(position - 1);
                        System.out.println("[" + element + " deleted from list]");
                        display();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("[Invalid position]");
                    }
                    break;
                case 5:
                    // Display list
                    display();
                    break;
                case 6:
                    // Exit
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("[Invalid choice. Please try again]");
            }
        }
    }

    static void display() {

        System.out.print("\nList: ");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // for (int items : list)
        // System.out.print(items + " ");
        // System.out.println();
    }
}
