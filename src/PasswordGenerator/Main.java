package PasswordGenerator;

public class Main {
    public static void main(String[] args) {
        String name = "Jack";
        PasswordGenerator p = new PasswordGenerator();
        System.out.println(p.generate(name));
    }
}
