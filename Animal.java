public class Animal {
    private String name = "Dog";
    String owner = "Bright";

    void displayAnimalName(){
        System.out.println("Name of animal:" + name);
        
    }

    void displayOwnerName(){
        System.out.println("Name of the owner:" + owner);
        
    }

    String getAnimalName(){
        return name;
    }


}
