package calcEngine;

public class calcEngine1 {
    public static void main(String[] Args){

        double[] first = {1d,2d,6};
        double[] second = {1d,2d,3d};
        char[] opCode = {'a','m','s'};
        double[] result = new double[opCode.length];

        for(int i=0;i<opCode.length;i++){
        switch (opCode[i]) {
            case 'a':
                result[i] = first[i] + second[i];  
                break;
            case 's':
                result[i] = first[i] - second[i];                
                break;
            case 'd':
                result[i] = second[i] != 0 ? first[i] / second[i] :  0.00d;
                //result = first[i] / second[i];             
                break;
            case 'm':
                result[i] = first[i] * second[i];    
                break;
            default:
                System.out.println("Invalid opCode!! " + "You have entered :" + opCode[i]);
                result[i]=00.00d;
                break;
        }
        
    }for(double j:result)
    System.out.println(j);
    }    
}
