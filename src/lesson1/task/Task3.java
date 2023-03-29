package lesson1.task;

public class Task3 {
    public static void numbers () {
        int count = 0;
        for(int i = 2; i <= 1000; i++) {
            for (int j = i - 1; j >= 1; j--){
                if (i % j == 0 && j != 1) {
                    break;
                } else if (i % j == 0 && j == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
