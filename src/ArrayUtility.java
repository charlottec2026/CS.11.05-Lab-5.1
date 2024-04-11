public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(array.toString());
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / (array.length);
        int averageTimes100 = (int) (average * 100);
        return averageTimes100 / 100.0;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reversed[index] = array[i];
            index++;
        }

        return reversed;
    }

    public static void reverseTwo(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        str = str + array[0] + ",";
        for (int i = 1; i < array.length-1; i++) {
            str = str + " " + String.valueOf(array[i]) + ",";
        }
        str = str + " " + String.valueOf(array[array.length-1]);
        return str;
    }

    public static boolean twoSum(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int lastElement = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1) {
            return;
        }
        int shifts = n % array.length;
        if (shifts == 0) {
            return;
        }
        for (int shiftCount = 0; shiftCount < shifts; shiftCount++) {
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
        }
    }

    public static void shiftLeftNTimes(int[] nums, int n) {
        if (nums.length <= 1) {
            return;
        }

        int shifts = n % nums.length;
        if (shifts == 0) {
            return;
        }
        for (int shiftCount = 0; shiftCount < shifts; shiftCount++) {
            int firstElement = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = firstElement;
        }
    }
}
