package exceptions;

/**
 * Created by zag on 07.06.2016.
 */
public class MyException extends Exception {
    private String message;

    MyException(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return message;
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}