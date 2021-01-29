package method;

public class arrayInterest {

    static double calculateIntrest(double principal,double rate,int year){
        return  principal*rate*year;
    }

    static double[] yearlyInterest(double principal,double rate,int year){
        double[] yearlyInteres = new double[year];
        for(int a=0;a<year;a++){
            int yeear= a+1;
            System.out.println("Ran for "+yeear+"year.");
            yearlyInteres[a]=calculateIntrest(principal, rate, yeear);
        }
        return yearlyInteres;
    }
    public static void main(String[] args) {
        double principal = 2500d;
        double rate = 2.5;
        int year =5;

        double[] amount= yearlyInterest(principal, rate, year);
        for(double j:amount)
        System.out.println(j);


        
    }
    
}
