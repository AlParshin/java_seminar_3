// Пусть дан произвольный список целых чисел, удалить из него чётные числа.

package java_projects.java_seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class hometask2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rdm = new Random();
        for (int i = 0; i < 25; i++)
            arr.add(rdm.nextInt(1, 100));
        System.out.println(arr);
        int len = arr.size();
        for (int j = 0; j < len; j++)
            if (arr.get(j) % 2 == 0) {
                arr.remove(j);
                len--;
                j--;
            }
        System.out.println(arr);
    }
}