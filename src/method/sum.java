package method;

public class sum {

    static void showSum(int x,int y,int z){
        if(z<1)
        return;
        for(int f=0;f<z;f++)
        System.out.println("Value of Sum of " +x+" "+y+"  is "+(x+y));
        return;

    }
    public static void main(String[] Args){
        int s=20,g=40,c=5;
        showSum(s,g,c);
        System.out.println("Returned from method!!!");
    }


    
}
