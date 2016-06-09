package exceptions;

/**
 * Created by zag on 07.06.2016.
 */
public interface ExceptionGenerator {
        void generateNullPointerException();
        void generateClassCastException();
        void generateNumberFormatException();
        void generateStackOverflowError();
        void generateOutOfMemoryError();
        void generateMyException(String message) throws MyException;
}
