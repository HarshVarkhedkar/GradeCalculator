import javax.security.auth.Subject;
import java.util.*;

public class Practise16_2 {
    //WAP of 5 subjects out of 100marks obtained
    public static void grade(int numbers) {
        if(numbers >= 90){
            System.out.println("Grade is : A");
        } else if (numbers>= 80) {
            System.out.println("Grade is : B");
        } else if (numbers>=70 ) {
            System.out.println("Grade is : C");
        } else if (numbers>=60) {
            System.out.println("Grade is : D");
        }else{
            System.out.println("Grade is : E");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Subject s1=new Subject();
        System.out.println("Enter Maths marks");
        int a =sc.nextInt();

        Subject s2=new Subject();
        System.out.println("Enter Science marks");
        int b =sc.nextInt();

        Subject s3=new Subject();
        System.out.println("Enter History marks");
        int c =sc.nextInt();

        Subject s4=new Subject();
        System.out.println("Enter English marks");
        int d =sc.nextInt();

        Subject s5=new Subject();
        System.out.println("Enter Mechanics marks");
        int e =sc.nextInt();

        int total =(a+b+c+d+e);
        int percentage=(total*100)/500;
        System.out.println("Total Marks "+total);
        System.out.println("Percentage is"+percentage);
        grade(percentage);
    }

}
