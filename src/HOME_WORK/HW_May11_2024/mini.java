package HOME_WORK.HW_May11_2024;

public class mini {
public static void main(String[] args) {

    // Create Multiple class for the ATB6X project, Attribute, Behaviour, Course, Student, Payment.
    //Create Object of 3 students and assign the values.

    //Student1 Details:
        studentInfo s1=new studentInfo();
        s1.name="Hari";
        s1.id=1234;
        s1.ph_no=9876543;
        s1.email="hari.k@gmail.com";
        s1.details();

        Payment p1=new Payment();
        p1.p_status=true;
        p1.p_method="crdeit Card";
        p1.overdue_amnt=1000;
        p1.details();

        course c1=new course();
        c1.c_name="Selenium";
        c1.c_id=2034;
        c1.c_status="In progress";
        c1.details();

    System.out.println("****************************");

    studentInfo s2=new studentInfo();
    s1.name="Vasu";
    s1.id=2345;
    s1.ph_no=87654;
    s1.email="vasu.v@gmail.com";
    s1.details();

    Payment p2=new Payment();
    p2.p_status=true;
    p2.p_method="UPI";
    p2.overdue_amnt=2000;
    p2.details();

    course c2=new course();
    c2.c_name="Python";
    c2.c_id=7643;
    c2.c_status="completed";
    c2.details();

    System.out.println("****************************");

    studentInfo s3=new studentInfo();
    s3.name="Mani";
    s3.id=9876;
    s3.ph_no=123654;
    s3.email="mani.m@gmail.com";
    s3.details();

    Payment p3=new Payment();
    p3.p_status=true;
    p3.p_method="cash";
    p3.overdue_amnt=3000;
    p3.details();

    course c3=new course();
    c3.c_name="Java";
    c3.c_id=5643;
    c3.c_status="In progress";
    c3.details();

}
}
