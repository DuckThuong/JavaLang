package OOP.Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayCalculator {
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int average(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = sum(numbers);
        return sum / numbers.length;
    }

    public static int max(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        return reversed;
    }

    public static int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static int[] sortDescending(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static int[] removeDuplicates(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            set.add(number);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeElement(int[] numbers, int index) {
        if (index < 0 || index >= numbers.length) {
            return numbers;
        }
        int[] result = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, result, 0, index);
        System.arraycopy(numbers, index + 1, result, index, numbers.length - index - 1);
        return result;
    }

    public static int[] insertElement(int[] numbers, int element, int index) {
        if (index < 0 || index > numbers.length) {
            return numbers;
        }
        int[] result = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, result, 0, index);
        result[index] = element;
        System.arraycopy(numbers, index, result, index + 1, numbers.length - index);
        return result;
    }

    public static int[] replaceElement(int[] numbers, int oldElement, int newElement) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == oldElement) {
                numbers[i] = newElement;
            }
        }
        return numbers;
    }

    public static int[] findElement(int[] numbers, int element) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                indices.add(i);
            }
        }
        return indices.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findAllElement(int[] numbers, int element) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                indices.add(i);
            }
        }
        return indices.stream().mapToInt(Integer::intValue).toArray();
    }
}
