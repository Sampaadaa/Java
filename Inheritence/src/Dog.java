public class Dog extends Animal{
//method overriding
    @Override
    public void Test(){

        //call method of superclass
        super.Test();
        System.out.println("i can eat");
    }

    public void eat(){
        System.out.println("yum yum");
    }



}
