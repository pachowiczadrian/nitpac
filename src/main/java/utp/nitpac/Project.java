package utp.nitpac;

/**
 * Główna klasa projektu.
 */
public class Project {

    public static void main(String[] args) {
        System.out.println(String.format("Java version: %s", System.getProperty("java.version")));
        System.out.println(String.format("Java runtime version: %s", System.getProperty("java.runtime.version")));
        System.out.println("Project name: ALGORYTMY I STRUKTURY DANYCH");
        System.out.println("DEV1: " + DEV1.author);
        System.out.println("DEV2: " + DEV2.author);
    }

}


