import java.util.Random;
import java.util.*;

public class Launcher {

    public static void main(String[] args) {
        Launcher script = new Launcher();
        script.menu();
    }

    public void menu() {
        int sel = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("1. Linked List Runner");
            System.out.print("Enter Selection: ");
            sel = in.nextInt();

            switch (sel) {
                case 1:
                    launchIntTreeNode();
                    break;
                case 2:
                    launchTreeIntSet();
                    break;
                case 3:
                    launchListIntSet();
                    break;
                case 4:
                    launchTreeIntSortedList();
                    break;
                case 5:
                    launchListIntSortedList();
                    break;
            }
        } while (sel != 9);
    }

    public void launchLinkedListRunner() {
        LinkedListRunner llr = new LinkedListRunner();
    }


}
