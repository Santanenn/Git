import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input;
        String oikeaNimi = ("Kalle");
        int arvaukset = 0;

        do{
            System.out.println("Arvaa nimi. Kirjoita Lopeta lopettaaksesi");
            input = in.nextLine();
            arvaukset++;

            if(input.equals(oikeaNimi))
            {
                System.out.println("Oikein! Arvasit " + arvaukset + " kertaa.");
                break;
            }
            if(input.equals("Lopeta"))
            {
                System.out.println("Arvasit " + arvaukset + " kertaa.");
                break;
            }
        }
        while(true);
    }
}
