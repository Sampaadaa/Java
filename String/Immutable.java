package String;

public class Immutable {
    public static void main(String[] args) {
        String name = "hii";
        name = name + " kutu ";
        //Actual data is not changed, olny object is created ,only the address is changed
        System.out.println(" oh! " + name);

        String s1 = "sampu";
        String s2 ="sampu";
        System.out.println(s1==s2);

    }
    
}
