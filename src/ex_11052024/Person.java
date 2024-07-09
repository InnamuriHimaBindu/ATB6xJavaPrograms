package ex_11052024;

public class Person
{
        //Attributes,Functions
        //Attributes

        String name;
        Byte age;
        long phone;
        String[] address;
        double height;
        boolean isMale;
        float salary;
        String dob;
        String eye_color;

        //Behaviour/functionality

        void walk()
        {
            System.out.println("I can walk");
        }
        void talk(String msg)
        {
            System.out.println("I will say->" + msg);
        }
        String sleep()
        {
            return "Sleeping";
        }
        String eat(String item)
        {
            return item;
        }

}
