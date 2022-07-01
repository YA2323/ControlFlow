public class Color {

    public static void main(String[] args) {

        String color = "gelb";

        int anzahl = 30;

        System.out.println(checkPersons(color,anzahl));

    }

    public static int switchA(String color) {

        switch (color) {
            case "rot":
                System.out.println("keine Person erlaubt");
                return 0;
            case "gelb":
                System.out.println("Max 30 Personen erlaubt");
                return 30;
            case "grün":
                System.out.println("Max 60 Personen erlaubt");
                return 60;
            default:
                System.out.println("Keine Farbe angegeben");
                return 0;
                
        }
    }

    public static String checkPersons(String col, int anz) {

       return numberProve(anz , switchA(col));



    }

    public static String numberProve (int anzahl, int erlaubt){

        if(anzahl> erlaubt){
            String over ="Zu viele Personen";
            return over;
        }
        else{
            String under = "Maximale Personenzahl nicht überschritten";
            return under;
        }

    }

}
