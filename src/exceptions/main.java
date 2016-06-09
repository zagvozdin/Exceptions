package exceptions;

import java.lang.reflect.Method;

/**
 * Created by zag on 07.06.2016.
 */
public class main implements ExceptionGenerator {

    public static void main(String[] args) {

        main m = new main();

        Method[] meths = m.getClass().getMethods();

        for (Method meth : meths) {
            // "generate" prefix only
            if (meth.getName().indexOf("generate") == -1) continue;

            try {
                System.out.println("Method call: " + meth.getName());
                if (meth.getParameterCount() > 0)
                    meth.invoke(m, "Show this as exception message, please.");
                else
                    meth.invoke(m, null);
            } catch (Exception e) {
                if (e.getCause() != null)
                    System.out.println("  Exception: " + e.getCause().toString());
                else
                    System.out.println("  Exception: " + e.toString());
            } finally {
                System.out.println("");
            }
        }
    }

    public void generateNullPointerException() {
        String s = null;
        System.out.println(s.toString());
    }

    public void generateClassCastException() {
        Object i = new Object();
        System.out.println((int) (i));
    }

    public void generateNumberFormatException() {
        String s = "xxl";
        System.out.println(Integer.parseInt(s));
    }

    public void generateStackOverflowError() {
        this.generateStackOverflowError();
    }

    public void generateOutOfMemoryError() {
        double[] dArr = new double[(int) 1e10];
    }

    public void generateMyException(String message) throws MyException {
        MyException e = new MyException(message);
        throw e;
    }
}
