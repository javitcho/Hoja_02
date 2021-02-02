/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author Mejia
 */
public class Calculadora implements Icalculadora{
    
    
    
    private boolean isOperator(char c){
        return (c=='+'|c=='-'|c=='*'|c=='/');
    }
    
    private double sumar(Stack stack){
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a+b;
    }
    private double restar(Stack stack){
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a-b;
    }
    private double multiplicar(Stack stack){
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a*b;
    }
    private double dividir(Stack stack){
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a/b;
    }
    
    @Override
    public double resolver(String input){
        Stack stack = new Stack<>();
        double res = 0;
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c!=' '){
                if(!isOperator(c)){
                    stack.push(Character.getNumericValue(c));
                } else{
                    switch(c){
                        case '+':
                            stack.push(sumar(stack));
                            break;
                        case '-':
                            stack.push(restar(stack));
                            break;
                        case '*':
                            stack.push(multiplicar(stack));
                            break;
                        case '/':
                            stack.push(dividir(stack));
                            break;
                    }
                }
            }
        }
        res = (double) stack.pop();
        return res;
    }
    
}
