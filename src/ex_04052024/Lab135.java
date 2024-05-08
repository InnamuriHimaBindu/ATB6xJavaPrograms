package ex_04052024;

public class Lab135 {
    public static void main(String[] args) {
        //Arrays-collection of similar data type.
        int[] salaries={30,50,60,10,100,999};
        int max_salary=Integer.MIN_VALUE;
        System.out.println(max_salary);
        System.out.println(Integer.MIN_VALUE);
        for(int i=0;i<salaries.length;i++)
        {
            if(salaries[i]>max_salary)
            {
                max_salary=salaries[i];
            }
        }
        System.out.println("max is->" +max_salary);
        int j=0;
        while (j < salaries.length) {
            if(salaries[j]>max_salary)
            {
                max_salary=salaries[j];
            }j++;
        }
        System.out.println("max is->" +max_salary);
    }
}
