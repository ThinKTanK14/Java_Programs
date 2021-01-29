package calcEngine;


public class calcEngine {

    public static void main(String[] args) {
        double value1 = 1000.1215,value2 = 500.153,result = 0;
        char opCode= 'd';

        /*if (opCode == 'a')
        result = value1 + value2;
        if (opCode == 's')
        result = value1 - value2;
        if (opCode == 'd')
        result = value1 / value2;
        if (opCode == 'm')
        result = value1 * value2;
        */
        switch (opCode) {
            case 'a':
                result = value1 + value2;  
                break;
            case 's':
                result = value1 - value2;                
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 :  0.00d;
                result = value1 / value2;             
                break;
            case 'm':
                result = value1 * value2;    
                break;
            default:
                System.out.println("Invalid opCode!! " + "You have entered :" + opCode);
                result=00.00d;
                break;
        }
        System.out.println(result);
    }
        
    
}
