import java.util.*;

public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
    }
    public static void zd1(){
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 2, 4, 4));

        for (int num:nums) {
            if (num%2!=0) {
                System.out.print(num + " ");
            }
        }
    }
    public static void zd2(){
        List<Integer> nums = new ArrayList<>(List.of(4, 2, 2, 4, 6));
        Collections.sort(nums);
        System.out.println(Arrays.asList(nums));

    }
}