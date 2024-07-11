package ExceptionHandling;

public class ExceptionDemo {
    public void myMethod(int a, int b) throws CustomException {
        try{
            int c = a/b;
        }
        catch (Exception e){
           // System.out.println("Please avoid dividing number by zero");
           throw new CustomException("Please avoid dividing number by zero");
        }
        finally {
            System.out.println( "I am in finally");
        }
    }

    public static void main(String[] args) throws CustomException {
        ExceptionDemo demo = new ExceptionDemo();
        demo.myMethod(2,0);
        System.out.println("I am out of exception");
    }
}
