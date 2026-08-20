package middle2;

public class Middle2 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 10;
        treebonacci(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }

    public static void treebonacci(int n) {
        if (n <= 0) return;
        if (n >= 1) System.out.print("0 ");
        if (n >= 2) System.out.print("0 ");
        if (n >= 3) System.out.print("1 ");

        long t0 = 0, t1 = 0, t2 = 1;
        for (int i = 3; i < n; i++) { // ровно n - 3 итераций
            long next = t0 + t1 + t2;
            System.out.print(next + " ");
            t0 = t1;
            t1 = t2;
            t2 = next;
        }
    }
}
