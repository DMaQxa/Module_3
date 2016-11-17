package task_3_4;

/**
 * Created by DAYu on 17.11.2016.
 */
public class UserMain {

    public static void main(String[] args) {
        User Georgiy = new User("Georgiy", "Kristalov", "Rub", 200, 10, 4500);
        Georgiy.paySalary();
        Georgiy.withdraw(400);
        Georgiy.companyNameLenght();
        Georgiy.monthIncreaser(12);
    }
}