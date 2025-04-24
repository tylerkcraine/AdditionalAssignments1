import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        String[] element = new String[]{"9, Fluorine, 7", "17, Chlorine, 7", "8, Oxygen, 6", "6, Carbon, 4", "1, Hydrogen, 1"};
        String[] sorted = Arrays.stream(element).sorted((a, b) -> {
            String[] aProps = a.split(", ");
            String[] bProps = b.split(", ");

            if (aProps[2].equals(bProps[2]))
                return aProps[1].compareTo(bProps[1]);
            else
                return Integer.parseInt(aProps[0]) - Integer.parseInt(bProps[0]);
        }).toArray(String[]::new);

        System.out.println(Arrays.toString(element));
        System.out.println(Arrays.toString(sorted));
    }
}