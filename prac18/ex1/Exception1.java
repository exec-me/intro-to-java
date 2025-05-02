package prac18.ex1;

public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        ex.exceptionDemo();
    }
}

//  при помощи try-catch, при возникновении ошибки, вместо того чтобы уйти в
//  аварийное завершение программы, попадает в блок catch, который обрабатывает
// исключение