// Enums should created in the following format:

// enum Level {
//   LOW,
//   MEDIUM,
//   HIGH
//}

//Level myVar = Level.MEDIUM;

public class ex3 {
    public enum color {
        red,
        blue,
        green,
        yellow
    }
    public static void main (String[] args) {
        color myFavorite=color.red;
        System.out.println(myFavorite);
    }
}
