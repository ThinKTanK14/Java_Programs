package calcEngine;

public class calEngineMethod {
    
    static void noArg(){
        double[] first = {1d,2d,6};
        double[] second = {1d,2d,3d};
        char[] opCode = {'a','m','s'};
        double[] result = new double[opCode.length];

        for(int i=0;i<opCode.length;i++){
            result[i]=calculator(first[i],second[i],opCode[i]);
        } 
    for(double j:result)
    System.out.println(j);
     
    }
     static void handLeCommandLine(String[] args){
        char opCode =args[0].charAt(0);
        double first = Double.parseDouble(args[1]);
        double second = Double.parseDouble(args[2]);
        double result = calculator(first,second,opCode);
        System.out.println(result);

    }
    static double calculator(double first,double second,char opCode){
        double result = 0;
        switch (opCode) {
            case 'a':
               result= first + second;
                break;
            case 's':
               result= first - second;                
                break;
            case 'd':
               result= second != 0 ? first / second :  0.00d;
                //result = first / second[i];             
                break;
            case 'm':
               result= first * second;    
                break;
            default:
                System.out.println("Invalid opCode!! " + "You have entered :" + opCode);
                result=00.0d;
                break;
        }
        return result;
    }
    public static void main(String[] args){

        if (args.length == 0){
        System.out.println("No arguments passed!!");
        noArg();
    }   else if(args.length == 3){
        handLeCommandLine(args);
    }   else
        System.out.println("Please input 2 double and 1 caracter from 'a s m d'.");
    }  
} 
 
 
    


    

