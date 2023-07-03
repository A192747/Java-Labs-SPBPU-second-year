package Exceptions;

public class InvalidFileFormatException extends Exception{
    String message;
    public InvalidFileFormatException(String message){
        this.message = message;
    }

    public String toString(){
        return message;
    }


}
