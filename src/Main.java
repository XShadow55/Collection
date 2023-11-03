import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
        zd4();
    }
    public static void zd1(){
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 2, 4, 4));

        for (int num:nums) {
            if (num%2!=0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void zd2(){
        List<Integer> nums = new ArrayList<>(List.of(4, 2, 2, 4, 6,1,3,5,7));

        Collections.sort(nums);


        int c = -1;
        for (int num:nums){
            if (num%2==0 && num!=c){
                c = num;
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void zd3(){
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String > numbers = new HashSet<>();
        numbers.addAll(strings);
        System.out.println(numbers);


    }
    public static void zd4(){
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Long> frequency =
                strings.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

         System.out.println(frequency.values());
        }





}