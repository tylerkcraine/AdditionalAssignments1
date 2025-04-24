package PasswordGenerator;

public class PasswordGenerator {
    public String generate(String name) {
        char c;
        String nums;

        if (name.length() % 2 == 0) {
            c = '@';
            nums = "654";
        }
        else {
            c = '!';
            nums = "432";
        }

        return "" + name.charAt(name.length()-1) +
                name.length() +
                c +
                name.charAt(0) +
                nums +
                name.charAt(name.length()-1);
    }
}
