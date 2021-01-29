package method;

public class interest {

    static double calculateIntrest(double principal,double rate,int year){
        return  principal*rate*year;
         

    }
    public static void main(String[] Args){
        double x=4500d, y=0.5d;
        int z=3; 
        double g = calculateIntrest(x,y,z);
        System.out.println("The Interest to be paid is : "+ g);

    }
}
