package ex_02052024;

public class Ex_04_maxvalue {
    public static void main(String[] args) {

        int[] arr={30,50,60,90,10,100,90,200};
        int max=arr[0];
        for(int i=0;i<arr.length ; i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("maximum valus:" +max);
    }

}
