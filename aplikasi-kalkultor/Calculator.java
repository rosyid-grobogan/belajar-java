package com.sekolahbackend;
import java.text.DecimalFormat;

public class Calculator {
    //property
    private double input1;
    private double input2;
    private String operator;
    private double result;

//    public double getResult(String operator2) {
//        return result;
//    }

    public void setResult(double result) {
        this.result = result;
    }

    public Calculator() {

    }

    public double getInput1() {
        return input1;
    }

    public void setInput1(double input1) {
        this.input1 = input1;
    }

    public double getInput2() {
        return input2;
    }

    public void setInput2(double input2) {
        this.input2 = input2;
    }



    public String getOperator() {
        return operator;
    }

    //decimalFormat.format(this.input1= value1 + this.input2 = value2) ;
    public void setOperator(String operator) {


        this.operator = operator;
    }


    public void processResult(double input1, double input2, String operator){

        switch (this.operator = operator) {
            case "+":
                result = (this.input1 = input1) + (this.input2 = input2) ;
                break;
            case "-":
              result = (this.input1 = input1) - (this.input2 = input2);
                break;
            case "*":
                result = (this.input1 = input1) * (this.input2 = input2);
                break;
            case "/":
                result = (this.input1 = input1) / (this.input2 = input2);
                break;
            case "%":
                result = (this.input1 = input1) % (this.input2 = input2);
                break;
            case "-999":
                System.out.println("Tidak tersedia") ;
               break;
            default:
                System.out.println("Operator tidak valid");
                break;
                //throw new IllegalArgumentException();
        }
        //return result;
    }


    public double getResult() {
        return result;
    }
}
