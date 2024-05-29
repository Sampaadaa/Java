public class Dog implements Animal ,Cat
{

    @Override
    public void makeSound() {
        System.out.println("vou vou");

    }

    @Override
    public void Eat() {
        System.out.println("yum yum");

    }

    @Override
    public void hiss() {
        System.out.println("meow meow");

    }

    @Override
    public void walk() {
        System.out.println("woku woku");

    }
}
