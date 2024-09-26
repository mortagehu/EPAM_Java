import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bekérjük a felhasználó nevét
        System.out.print("Kérlek add meg a neved: ");
        String name = scanner.nextLine();

        // Bekérjük a nyelvet, alapértelmezett a magyar
        String language = "hun"; // alapértelmezett nyelv
        if (args.length > 0) {
            language = args[0];
        } else {
            System.out.print("Kérlek add meg a nyelvet (hun/eng/haw): ");
            language = scanner.nextLine();
        }

        // Üdvözlés a megadott nyelven
        switch (language.toLowerCase()) {
            case "hun":
                System.out.println("Szia, " + name + "!");
                break;
            case "eng":
                System.out.println("Hello, " + name + "!");
                break;
            case "haw":
                System.out.println("Aloha, " + name + "!");
                break;
            default:
                System.out.println("Hiba: Ismeretlen nyelv: " + language);
                break;
        }

        scanner.close();
    }
}
