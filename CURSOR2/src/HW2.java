import java.util.*;

public class HW2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        startConversation(scan);

    }

    private static void startConversation(Scanner scan) {
        String hub;
        System.out.println("Hello! Choose one of methods:");
        System.out.println("1.onSortIntegersSelected");
        System.out.println("2.onArithmeticMeanSelected");
        System.out.println("3.onSumPositiveNumbers");
        do {
            switch (hub = scan.nextLine()) {
                case "1":
                    onSortIntegersSelected(scan);
                    break;
                case "2":
                    onArithmeticMeanSelected(scan);
                    break;
                case "3":
                    onSumPositiveNumbers(scan);
                    break;
                case "exit":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("wrong number");
                    System.out.println("Please enter number from list:");
                    break;
            }
        } while (!hub.equalsIgnoreCase("exit"));
    }

    private static int calculate(int[] arr) {
        int sum = 0;
        for (int anArr : arr) {
            if (anArr > 0) {
                sum += anArr;
            }
        }
        System.out.print("sum of positive numbers: ");
        return sum;
    }

    private static int mid(List<Integer> arrList) {
        int sum = 0;
        for (Integer integer : arrList) {
            sum += integer;
        }
        return sum / arrList.size();
    }

    private static void onSortIntegersSelected(Scanner scanner) {
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                boolean isFirstNumberEven = o1 % 2 == 0;
                boolean isSecondNumberEven = o2 % 2 == 0;
                if (isFirstNumberEven && !isSecondNumberEven) {
                    return -1;
                } else if (!isFirstNumberEven && isSecondNumberEven) {
                    return 1;
                } else if (isFirstNumberEven && isSecondNumberEven) {
                    return o1 - o2;
                } else {
                    return o1 - o2;
                }
            }
        });
        fillCollection(set, scanner);
        printCollection(set);
    }

    private static void onArithmeticMeanSelected(Scanner scan) {
        ArrayList<Integer> arrlist = new ArrayList<>();

        fillCollection(arrlist, scan);
        printCollection(arrlist);
        System.out.println("arithmetic mean of your array: " + mid(arrlist));
    }

    private static void printCollection(Collection<Integer> arrlist) {
        if (arrlist.isEmpty()) {
            System.out.print("Collection is empty");
            return;
        }
        System.out.print("your array: ");
        Iterator<Integer> iterator = arrlist.iterator();
        do {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        } while (iterator.hasNext());
    }

    private static void fillCollection(Collection<Integer> arrlist, Scanner scan) {
        System.out.println("Enter integers and then enter 'done':");
        do {
            if (scan.hasNextInt()) {
                arrlist.add(scan.nextInt());
            }
        } while (!scan.nextLine().equalsIgnoreCase("done"));

        System.out.println();
    }

    private static void onSumPositiveNumbers(Scanner scan) {
        System.out.print("Enter array capacity = ");
        int[] arr = new int[scan.nextInt()];

        for (int j = 0; j < arr.length; j++) {
            System.out.print("array [" + j + "] = ");
            arr[j] = scan.nextInt();
        }

        System.out.print(calculate(arr));
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
    }
}