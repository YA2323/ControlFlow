public class ControlFlow {


    public static void main(String[] args) {

       String erg =   numberProve(40);
       System.out.println(erg);

    }
    public static String numberProve (int anzahl){

        if(anzahl> 30){
            String over ="Zu viele Personen";
            return over;
        }
        else{
            String under = "Maximale Personenzahl nicht überschritten";
            return under;
        }

    }


}
