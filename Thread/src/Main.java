//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Tasks are running parallel
public class Main {
    public static void main(String[] args) {
        Hello h =new Hello();
        Welcome w = new Welcome();
        h.start();
        w.start();

    }
}