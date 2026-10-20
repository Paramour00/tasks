package task8;

class Task8 {

    int[] cumulativeSums;

    public int sumAll(int... numbers) {
        cumulativeSums = new int[numbers.length];
        int total = 0;

        for (int index = 0; index < numbers.length; index++) {
            int n = numbers[index];
            cumulativeSums[index] = cumulativeSum(n);
            total += n;
        }

        return total;
    }

    // Helper: returns 1+2+...+n
    int cumulativeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Helper: builds the text "1+2+...+n"
    String expression(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            if (i < n) sb.append("+");
        }
        return sb.toString();
    }

    public int[] getCumulativeSums() {
        return cumulativeSums;
    }

    public void printDetails(int... numbers) {
        for (int index = 0; index < numbers.length; index++) {
            int n = numbers[index];
            System.out.println(n + " = (" + expression(n) + ") = " + cumulativeSums[index]);
        }
    }
}

public class VarArgsDemo {
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        int total = task8.sumAll(3, 5, 7);
        System.out.println("Total sum of parameters: " + total);
        task8.printDetails(3, 5, 7);
    }
}

