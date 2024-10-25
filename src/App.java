public class App {
    @SuppressWarnings("static-access")
    public static void main(String[] args){
        /*
         * WRAPPER CLASS
         * 
         * permettono di trasformare le variabili primitive in reference
         * accesso ai metodi
         * possibilità di impiego per gli ArrayList
         * 
         * Su Grandi Volumi di Dati possono presentare problemi,
         * perché, dopo essere stati impacchettati, devono essere elaborati e spacchettati per restituire un valore
         *
         * 
         *** TIPI ***
         * 
         * boolean -> Boolean
         * 
         * int -> Integer
         * 
         * char -> Character
         * 
         * double -> Double
         * 
         */

        //dichiaro un Wrapper class
        Boolean isTrue = true;
        //
        //dichiaro una varibile primitiva
        boolean truth = true;

        //controllo
        //SE la Wrapper class è UGUALE alla primitiva
            //ALLORA stampa "isTrue è uguale a truth"
        //ALTRIMENTI non sono uguali
        if(isTrue == truth){
            System.out.println(isTrue + " è uguale a " + truth);  //vuol dire che la wrapper class resta comunque una variabile primitiva

        } else {
            System.out.println(isTrue + " NON è uguale a " + truth); //significa che la wrapper class non è più una variaible primitiva
        }

        //dichairo un carattere come Wrapper class ed invoco il metodo .toUpperCase()
        Character charac = 'f';
        System.out.println(charac.toUpperCase(charac)); //stampa il carattere Maiuscolo [N.B. se fosse rimasta una variabile primitiva di tipo "char", NON avrei avuto accesso al metodo toUpperCase()]
    }
}
