class InvalidInputException extends Exception{
    public String getString(){
        return "Invalid Input";
    }
}
class MaxInputException extends Exception{
    public String getString(){
        return "Input should less than 1000";
    }
}
class CannotDivdideBy0Exception extends Exception{
    public String getString(){
        return "Cannot divide by 0";
    }
}
class MaxMultiplyException extends Exception{
    public String getString(){
        return "Input should be less than 70";
    }
}
class Operations {
    public double add(double a, double b) throws InvalidInputException,MaxInputException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    public double sub(double a, double b) throws MaxInputException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        return a-b;
    }
    public double multiply(double a, double b) throws MaxInputException,MaxMultiplyException{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        if(a>70 || b>70){
            throw new MaxMultiplyException();
        }
        return a*b;
    }
    public double division(double a, double b) throws MaxInputException, CannotDivdideBy0Exception{
        if(a>1000 || b>1000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivdideBy0Exception();
        }
        return a/b;
    }
}

public class Calculator {
    public static void main(String[] args) throws InvalidInputException, MaxInputException,
            MaxMultiplyException,CannotDivdideBy0Exception{
        Operations op = new Operations();
        //System.out.println(op.add(8,9));
        System.out.println(op.sub(18,8));
        //System.out.println(op.multiply(80,10));
        System.out.println(op.division(80,10));


    }
}
