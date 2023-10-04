
public class binaryserch {
    // function for reversing an array
    public static void reversanarray(int employeeage[]) {
        int first = 0, last = employeeage.length - 1;
        while (last > first) {

            //function for swapping for reversing an array we use swapping function
            int temp = employeeage[last];
            employeeage[last] = employeeage[first];
            employeeage[first] = temp;
            first++;
            last--;

        }
    }

    public static int binary_search(int Numbers[], int key) {
        int start = 0, end = Numbers.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {

            if (Numbers[mid] == key) {
                return mid;
            }
            if (key < Numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int Numbers[] = {12, 25, 30, 36, 42};  //for binary search array must be sorted
        int key = 36;
        System.out.println("key is at position" + binary_search(Numbers, key));

        int employeeage[] = {24, 27, 30, 42, 45};
        reversanarray(employeeage);
        for (int j = 0; j < employeeage.length; j++) {
            System.out.print("reverse array is" + employeeage[j] + " ");
        }
        System.out.println();
    }
}

