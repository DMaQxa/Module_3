package task_3_2;

/**
 * Created by DAYu on 16.11.2016.
 */
public class Adder extends Arithmetic {
    static boolean check(Integer a, Integer b){
        if (a >= b) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void main(String[] args) {
        System.out.println(check(12,6));
        System.out.println(check(8,0));
        System.out.println(add(280,960));
    }


}
