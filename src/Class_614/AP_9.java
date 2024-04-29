package Class_614;
import java.util.Scanner;

//Problem 1
//public class AP_9 {
//    static int countElementsLessThanOrEqual(int[] arr, int x) {
//        int left = 0;
//        int right = arr.length - 1;
//        int result = -1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (arr[mid] <= x) {
//                result = mid;
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return result + 1;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of the sorted array: ");
//        for (int i = 0; i < n; ++i) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.print("Enter the value of x: ");
//        int x = scanner.nextInt();
//        int count = countElementsLessThanOrEqual(arr, x);
//        System.out.println("Number of elements less than or equal to " + x + ": " + count);
//    }
//}


//Problem 2
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//public class AP_9 {
//    static ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        }
//        return prev;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of nodes in the linked list: ");
//        int n = scanner.nextInt();
//        ListNode head = null;
//        ListNode tail = null;
//        System.out.print("Enter the values of the nodes: ");
//        for (int i = 0; i < n; ++i) {
//            int val = scanner.nextInt();
//            ListNode newNode = new ListNode(val);
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//        head = reverseList(head);
//        System.out.print("Reversed linked list: ");
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//}


//Problem 3
//import java.util.ArrayList;
//import java.util.List;
//public class AP_9 {
//    static int singleNumber(List<Integer> nums) {
//        int result = 0;
//        for (int num : nums) {
//            result ^= num;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of elements in the array: ");
//        int n = scanner.nextInt();
//        List<Integer> nums = new ArrayList<>();
//        System.out.print("Enter the elements of the array: ");
//        for (int i = 0; i < n; ++i) {
//            nums.add(scanner.nextInt());
//        }
//        int single = singleNumber(nums);
//        System.out.println("The single number is: " + single);
//    }
//}


//Problem 4
//import java.util.ArrayList;
//public class AP_9 {
//    static void insert(ArrayList<Integer> arr, int i) {
//        int key = arr.get(i);
//        int j = i - 1;
//        while (j >= 0 && arr.get(j) > key) {
//            arr.set(j + 1, arr.get(j));
//            j--;
//        }
//        arr.set(j + 1, key);
//    }
//    static void insertionSort(ArrayList<Integer> arr, int n) {
//        for (int i = 1; i < n; i++) {
//            insert(arr, i);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int n = scanner.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.print("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr.add(scanner.nextInt());
//        }
//        insertionSort(arr, n);
//        System.out.print("Sorted array: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr.get(i) + " ");
//        }
//        System.out.println();
//    }
//}


//Problem 5
import java.util.ArrayList;
public class AP_9 {
    static int searchInsert(ArrayList<Integer> nums, int target) {
        int left = 0, right = nums.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) == target) {
                return mid;
            } else if (nums.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.print("Enter the elements of the sorted array: ");
        for (int i = 0; i < n; ++i) {
            nums.add(scanner.nextInt());
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        int index = searchInsert(nums, target);
        System.out.println("Index where target would be inserted: " + index);
    }
}


