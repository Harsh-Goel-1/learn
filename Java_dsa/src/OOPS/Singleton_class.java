package OOPS;

// we want to create a singleton class that can have only 1 object,
// utility class is simply static constructor, 0 objects allowed
public class Singleton_class {

    // made the constructor private so that you cannot create objects directly
    private Singleton_class(){}
    private static Singleton_class instance;

    // this needs to be static since user cant create object so will call function via class
    public static Singleton_class makeAnInstance(){
        if(instance == null)
        {
            instance = new Singleton_class();
        }
        return instance;
    }
}
