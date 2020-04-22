import java.util.Scanner;

class helloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dies ist ein hello World Programm und lediglich für Jenkins erstellt");
        System.out.println("wir spielen mit ihnen nun ein ratespiel");
        System.out.println(
                "Es wird eine Zahl zwischen 0 und 100 generiert. \n sie werden in folge abgefragt, um welche zahl es sich handelt. \n sind sie zu hoch, oder zu niedrig wird ihnen das angesagt. \n ihre versuche werden gezählt.");
        boolean play = true;
        int score = 99999;
        while (play == true) {
            int zahl = (int) (Math.random() * 101);
            System.out.println("Die Zahl wurde erstellt. Bitte geben sie Ihre erste Vermutung ein:");
            int eingabe = scan.nextInt();
            int count = 1;
            while (zahl != eingabe) {
                if (eingabe >= 0 && eingabe <= 100) {
                    if (zahl > eingabe) {
                        System.out.println("Ihre Zahl war zu niedrig");
                    } else if (zahl < eingabe) {
                        System.out.println("Ihre Zahl war zu hoch");
                    }
                    count++;
                    System.out
                            .println("Bitte geben sie erneut eine Zahl ein. Dies ist ihr Versuch Nr. " + count + " .");
                    eingabe = scan.nextInt();
                } else {
                    System.out.println(
                            "Ihre Zahl befindet sich nicht im angegeben Rahmen. 0 - 100.. \n versuchen sie es noch einmal");
                    eingabe = scan.nextInt();
                }
            }
            if (zahl == eingabe) {
                System.out.println("Sie habe gewonnen und es in " + count + " Versuchen geschaft!");
                if (score > count){
                    score=count;
                    System.out.println("Sie haben den Hightscore geknackt!");
                } else {
                    System.out.println("Der Hightscore liegt zurzeit bei " +score+ " Versuchen");
                }
                System.out.println("Möchten sie weiter spielen?");
                System.out.println("Bestätigen mit ja");
                String best;
                best = scan.next();
                if (best.equalsIgnoreCase("ja")){
                    play = true;
                    System.out.println("Neue Runde neues Glück");
                } else {
                    play = false;
                    System.out.println("Das system wird beendet");
                }
            }
        }
    }
}

