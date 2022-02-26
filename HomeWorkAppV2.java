package version.java.lesson;
// Task 1
public class HomeWorkAppV2 {
    public static void main(String[] args) {
        System.out.println(Task1(1, 13));
        Task2(1);
        System.out.println(Task3(20));
        Task4("zero", 5);

        System.out.println(Task5(4)); // Task 5*
    }

    public static boolean Task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void Task2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean Task3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void Task4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    public static boolean Task5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}