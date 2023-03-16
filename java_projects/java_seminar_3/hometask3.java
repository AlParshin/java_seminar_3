// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package java_projects.java_seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class hometask3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rdm = new Random();
        for (int i = 0; i < 10; i++)
            arr.add(rdm.nextInt(1, 100));
        System.out.println(arr);
        System.out.println("Максимум = " + findMax(arr));
        System.out.println("Минимум = " + findMin(arr));
        System.out.println("Среднее = " + findAvg(arr));
    }

    public static int findMax(ArrayList<Integer> a) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++)
            if (a.get(i) > max)
                max = a.get(i);
        return max;
    }

    public static int findMin(ArrayList<Integer> a) {
        int min = a.get(0);
        for (int i = 1; i < a.size(); i++)
            if (a.get(i) < min)
                min = a.get(i);
        return min;
    }

    public static float findAvg(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++)
            sum = a.get(i) + sum;
        float avg = sum;
        float sz = a.size();
        avg = avg / sz;
        return avg;
    }
}