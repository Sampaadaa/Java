
import java.util.Scanner;

public class Task {
    //encapsulation
    private String title ;
    private String description;
    private boolean isCompleted;

    //constructor
    public Task(String title,String description){
        this.title=title;
        this.description=description;
        this.isCompleted=false;

    }
    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void markAsCompleted(){
        this.isCompleted=true;

    }
    public void updateTask(String title,String description){
        this.title=title;
        this.description=description;


    }

//String representation of task
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }




}
