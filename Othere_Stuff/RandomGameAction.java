import java.util.Random; // Einfache Art Random Int zu generieren
import java.util.ArrayList; // Braucht man für Arry List

public class RandomGameAction {
           

  public static void main(String[] args) {
    
    ArrayList<String> b1 = new ArrayList<>(); // Start Arry List
      b1.add("League of Legends");
      b1.add("Valorant");
      b1.add("Baldures Gate 3");
      b1.add("Minecraft");
           
    ArrayList<String> b2  = new ArrayList<>(); // Start new Arry
      b2.add("Spielen");
      b2.add("Deinstallieren");
      b2.add("Installieren");
      b2.add("Kaufen");
      b2.add("Modden");

    ArrayList<String> b3 = new ArrayList<>();
      b3.add(".");
      b3.add("???");
      b3.add("!!!");
      b3.add("?");
      b3.add("!");
      b3.add("...");

    int a1 = b1.size(); // Länge der Arry List
    int a2 = b2.size();
    int a3 = b3.size();
    int f1 = b1.size();
    int f2 = b2.size();
    int f3 = b3.size(); 
       
    int z1 = new Random().nextInt(f1); //Random Nummber
    int z2 = new Random().nextInt(f2);
    int z3 = new Random().nextInt(f3);

    System.out.print("Ich möchte "+b1.get(z1) +" " +b2.get(z2) +b3.get(z3)); // Print

  } 

} 


