package exceptions;

/**
 * Created by zag on 27.05.2016.
 */

class zagException extends Exception {
/*
    public String toString(){
        return "Хуйевознает, шта-та уеблося...";
    }
*/
}

class Exceptions /*extends zagException*/ {
    public static void main(String args[]) {
//        zagException zag = new zagException();
//        try {
//            throw zag;
//        } catch (Throwable x) {
//            System.out.println("Message: \t\t\t" + x.getMessage());
//            System.out.println("fillInStackTrrace: \t" + x.fillInStackTrace());
//            System.out.println("getStackTrace: \t" + x.getStackTrace());
//            System.out.println(x.toString());
//        }
//        int i[] = {1, 2, 3, 4, 5, 6, 7}, j[] = {2, 4, 6};
//        for (int k = 0; k < i.length; k++)
//            try {
//                System.out.println(i[k] + " " + j[k]);
//            } catch (ArrayIndexOutOfBoundsException e) {
///*
//                System.out.println("Message: \t\t\t" + e.getMessage());
//                System.out.println("fillInStackTrrace: \t" + e.fillInStackTrace());
//                System.out.println("getStackTrace: \t" + e.getStackTrace());
//*/
//                StackTraceElement ste[] = e.getStackTrace();
//                System.out.println("-- start ----");
//                for (StackTraceElement s : ste
//                        ) {
//                    // filter; I wish to see my class only, not sun.java etc...
//                    if (Thread.currentThread().getStackTrace()[1].getClassName().toString().equals(s.getClassName().toString()))
//                        System.out.println("File: " + s.getFileName() + "; Class: " + s.getClassName().toString() + "; Line: " + s.getLineNumber());
//                }
//                System.out.println("-- end   ----");
//                System.out.println();
//            }
///*
//            catch (Throwable e){
//                System.out.println("Залу: ");
//                StackTraceElement ste[] = e.getStackTrace();
//                for (StackTraceElement s: ste
//                        ) {
//                    // filter; I wish to see my class only, not sun.java etc...
//                    if ( Thread.currentThread().getStackTrace()[1].getClassName().toString().equals(s.getClassName().toString()))
//                        System.out.println("File: " + s.getFileName() + "; Class: " + s.getClassName().toString() + "; Line: " + s.getLineNumber());
//                }
//
//            }
//*/
    }
}

//  Повторное  генерирование  исключений
class Rethrow {
    public static void genException() {
//  Длина  массива  number  превыает  длину  массива  denom
//        int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
//        int denom[] = {2, 0, 4, 4, 0, 8};
//        for (int i = 0; i < number.length; i++)
//            try {
//                System.out.println(number[i] + "  /  " + denom[i] + "  равно  " + number[i] / denom[i]);
//            } catch (ArithmeticException ехс) {
//                //  Перехватить  исключение
//                System.out.println("Пoпыткa  деления  на  нуль");
//            } catch (ArrayIndexOutOfBoundsException ехс) {
//                //  Перехватить  исключение
//                System.out.println("Cooтвeтcтвyющй  элемент  не  найден");
//                throw ехс;  //  повторно  сгенерировать  исключение
//            }
    }
}

class RethrowDemo {

    public static void main(String args[]) {
//        String c;
//        try {
//            c = prompt("Type a word");
//        } catch (IOException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
//            System.out.println(e);
//            c = new String("\t");
//        }
//        System.out.println(c);
//    }
//
//
//        try {
//            Rethrow.genException();
//        } catch (ArrayIndexOutOfBoundsException ехс) {
//            //  Повторно  перехватить  исключение
//            System.out.println("Фaтaльнaя ошибка  - " + "выполнение программы прервано!");
    }
}
