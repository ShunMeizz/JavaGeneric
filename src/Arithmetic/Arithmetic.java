package Arithmetic;

public class Arithmetic <A extends Number, V extends Number> {
    A num1;
    V num2;
    public Arithmetic(A num1, V num2){
            this.num1 = num1;
            this.num2 = num2;
    }
    public Number add(){
        return num1.doubleValue() + num2.doubleValue();
    }
    public Number subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }
    public Number multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }
    public Number divide(){
        if(num2.doubleValue()==0){
            System.out.println("Cannot be divided by zero");
            return null;
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public Number getMin(){
        return Math.min(num1.doubleValue(),num2.doubleValue());
    }
    public Number getMax(){
        return Math.max(num1.doubleValue(),num2.doubleValue());
    }

}
