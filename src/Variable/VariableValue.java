package Variable;

public class VariableValue {
    public static void main(String[] args) {
        int value = 100;
        int secondValue = value;
        
        value = 50;
        secondValue = 90;
        System.out.println(secondValue);
        System.out.println(value);
    }
}
