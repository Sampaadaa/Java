//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
           int result =4 / 2;
            System.out.println("answer is" + result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception"  + e.getMessage());
        }

        finally{
            System.out.println(" lets go");
        }

    }
}