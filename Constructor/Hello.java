

 class Start {
    int roll;
    String place;
    int year;
//Default constructor
    Start (){
        year = 9;

    }

//Constructor initialized
//constructor overloading(same method with different parameter)
    Start(int num ,String name){
        roll = num;
        place = name;
        
        
    }

}


public class Hello{
    public static void main(String[] args) {
        Start h = new Start(7 ," sampu ");
        Start p =new Start();
        System.out.println(p.year);
        System.out.println(h.roll + h.place);
        
        

    }
    
    
    
  

    
    
}