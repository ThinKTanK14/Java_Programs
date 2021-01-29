package method;

public class swap {

    static void swwap(int x,int y){
        int j=x;
        x=y;
        y=j;
        System.out.println("Value of x and y after swap:" +x+"    "+y);

    }
    public static void main(String[] Args){
        int s=20,g=40;
        swwap(s,g);


    }
    
}
