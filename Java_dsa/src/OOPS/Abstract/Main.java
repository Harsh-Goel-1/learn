package OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        Parent azu = new son(18);
        Parent azi = new daughter();
        azu.career();
        azi.career();
        System.out.println(azu.age);
        System.out.println(azi.age);
    }
}
