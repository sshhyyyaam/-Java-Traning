package StudentTestScoreTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        
        int[] scores = new int[n];

        
        System.out.println("Enter " + n + " space-separated integers:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

       
        ArrayList<Integer> scoreList = new ArrayList<>();

        
        for (int score : scores) {
            scoreList.add(score);
        }

       
        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        
        scanner.close();
    }
}
