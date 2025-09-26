package OOPS.collections;

public class Enums {
    // enum in java is like a class with its enum constants being instances of itself
    // enum can implement interfaces but cannot extend classes since all enums extend java.lang.Enum class
    enum Week {
        Monday, Tuesday, Wed, Thu, Fri, Sat, Sun;
        // these are enum constants, they are public static final
        Week() {
            System.out.println("meow " + this);
        }
        // constructor cannot be public or protected, the scope needs to be local to allow no changes to enum
    }

    public static void main(String[] args) {
        Week week;
        // constructor is called and meow is printed 7 times
        week = Week.Monday;
        week = Week.Tuesday;
        for(Week day: Week.values())
        {
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
