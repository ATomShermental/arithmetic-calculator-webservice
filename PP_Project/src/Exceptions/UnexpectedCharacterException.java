package Exceptions;

public class UnexpectedCharacterException extends Exception{

    public UnexpectedCharacterException(){}
    public UnexpectedCharacterException(String string){
        System.out.println(string);
    }
}
