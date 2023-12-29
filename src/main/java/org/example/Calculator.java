package org.example;

public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int num1, int num2){
        this.number1 = num1;
        this.number2 = num2;
    }

    public int plusNumbers(){
        return number1 + number2 ;
    }

    public int minusNumbers(){
        return number1 - number2;
    }

    public int multiplyNumbers(){
        return number1 * number2;
    }

    public int divideNumbers(){
        if( number1 != 0 && number2 != 0){
            return number1 / number2;
        }else{
            throw new RuntimeException();
        }

    }

}
