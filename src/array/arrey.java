package array;

public class arrey {
    public static void main(String[] args) {
        
        float j[] = {45.26f,19.58f,78.26f};
        /*float j[] = new float[3];
        j[0] = 45.26f;
        j[1]= 15.48f;
        j[2]= 43.59f;*/
        int suum=0;

            for(int index=0;index < j.length; index++){
                System.out.print(j[index]+" ");
                    suum += j[index];
            }       
            System.out.println(suum);
            
    } 
}
