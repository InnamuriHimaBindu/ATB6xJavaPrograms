package ex_23042024;
import java.util.Scanner;
public class Lab077 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);          ///grade calculator
                //A->90-100
                //B->80-89
                //c->70-79
                //D->60-69
                //E->0-59

        System.out.println("Enter the student score");
        int score=sc.nextInt();

        char grade= 'F';
        if(score>=90 && score <=100)
        {
            grade='A';
        }
        else if(score<=89 && score>=80)
        {
            grade='B';
        }
        else if(score<=79 && score >=70)
        {
            grade='C';
        }
        else if(score<=69 && score>=60)
        {
            grade='D';
        }
        else if(score>100)
        {
            System.out.println("LoL!");
        }
        else
        {
            grade='F';
        }
        System.out.println(("you grade is->:" +grade));
        sc.close();
    }
}
