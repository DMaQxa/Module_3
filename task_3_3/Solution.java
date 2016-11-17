package task_3_3;

/**
 * Created by DAYu on 16.11.2016.
 */
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        courses();
    }

    static Course[] courses(){
        Course[] coursesTaken = new Course[3];

        Course English = new Course("English", "Pevchih", 90);
        Course JavaCore = new Course(new Date(120, 9, 1), "GoIT");
        Course Deutsch = new Course(new Date(120, 10, 1), "Deutsch");


        coursesTaken[0] = English;
        coursesTaken[1] = JavaCore;
        coursesTaken[2] = Deutsch;

        return coursesTaken;
    }

    static void createStudents(){

        Student Nekiforov = new Student("Viktor", "Nekiforov", 118);
        Student Kulikov = new Student("Kulikov", courses());
        Student Dubov = new Student("Oleg", "Dubov", 116);
        Student Malukov = new Student("Malukov", courses());
        CollegeStudent Jeckil = new CollegeStudent("John", "Jeckil", 333, 33, courses(), "KGGU", 5, 98656);
        CollegeStudent Mikali = new CollegeStudent("Lotar", "Mikali", 215);
        CollegeStudent Suharev = new CollegeStudent("Suharev", courses());
        SpecialStudent Lenskiy = new SpecialStudent("Semen", "Lenskiy", 218, 14, courses(), "YaUM", 3, 99742);
        SpecialStudent Chernyshov = new SpecialStudent("Sergiy", "Chernyshov", 32);
        SpecialStudent TheKey = new SpecialStudent(121465978);
    }
}

