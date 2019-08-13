import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        onArithmeticMeanSelected(scan);
//        onSumPositiveNumbers(scan);


    }

    private static int calculate(int[] arr) {
        int sum = 0;
        for (int anArr : arr) {
            if (anArr > 0) {
                sum += anArr;
            }
        }
        System.out.println("sum of positive numbers:");
        return sum;
    }

    private static int mid(List<Integer> arrList) {
        int sum = 0;
        for (Integer integer : arrList) {
            sum += integer;
        }
        return sum / arrList.size();
    }

    private static void onArithmeticMeanSelected(Scanner scan) {
        ArrayList<Integer> arrlist = new ArrayList<>();

        System.out.println("Enter integers and then enter 'done':");
        do {
            if (scan.hasNextInt()) {
                arrlist.add(scan.nextInt());
            }
        } while (!scan.nextLine().equalsIgnoreCase("done"));

        System.out.println();

        System.out.print("your array: ");
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.print(arrlist.get(i));
            if (i != arrlist.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        System.out.println("arithmetic mean of your array: " + mid(arrlist));
    }

    private static void onSumPositiveNumbers(Scanner scan){
        System.out.println("Enter array capacity");
        int[] arr = new int[scan.nextInt()];

        for (int j = 0; j < arr.length; j++) {
            System.out.println("array [" + j + "] =");
            arr[j] = scan.nextInt();
        }

        System.out.println(calculate(arr));
    }
}