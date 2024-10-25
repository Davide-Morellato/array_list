import java.util.ArrayList;

public class App {
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


        ///////////////////////////////////////////
        //
        /*
         * ARRAYLIST
         * 
         * ARRAYLIST 2D 
         */
        //
        //
        //dichiaro l'ArrayList,ne definisco il tipo, e lo nomino
        //creo l'ArrayList e ne definisco il tipo
        ArrayList <String> people = new ArrayList<String>(); //è stato importato automaticamente: import java.util.ArrayList;


        /* AGGIUNGO ELEMENTI [add()] */
        people.add("Luca");
        people.add("Marco");
        people.add("Anna");

        //stampo un valore inserito nell'array in base all'indice, mediante il metodo .get()
        System.out.println(people.get(0)); //stampo il primo elemento dell'array


        /* CICLO L'ARRAY */
        //
        //per stampare tutti gli elementi dell'array, uso il ciclo for
        //essendo un ArrayList, si sfrutta il metodo size() per scorrerne la lunghezza
        for(int i = 0; i < people.size(); i++){
            System.out.println("elemento dell'ArrayList: " + people.get(i));
        }


        /* IMPOSTARE I DATI */
        //
        //per impostare nuovi dati sfrutto il metodo .set()
        //passo 2 parametri: indice, valore
        people.set(0, "Gianni");

        System.out.println("nuovo valore indice 0: " + people.get(0)); //L'elemento "Luca" è stato sostituito da "Gianni"

        //
        //IN QUESTO CASO DEVE ESSERE FATTA UN AGGIUNTA
        //PERCHE' L'INDICE 3 NON ESISTE IN QUESTO ARRAY
        // people.set(3, "Davide");
        // System.out.println(people.get(3)); -> ERRORE IN CONSOLE AL MOMENTO DELLA STAMPA
        //

        /* RIMUOVERE UN ELEMENTO */
        //
        //per rimuovere un elemento, uso il metodo .remove()
        //in cui passo come parametro l'indice di rifermento
        people.remove(1);
        //ciclo l'array per stamparne gli elementi
        for(int i = 0; i < people.size(); i++){
            System.out.println("rimozione dell'indice 1: " + people.get(i)); //l'elemento all'indice 1 ("Marco") è stato rimosso
        }


        /* SVUOTAMENTO ARRAYLIST */
        //
        //per svuotare l'ArrayList, sfrutto il metodo .clear()
        people.clear();

        //System.out.println(people.get(0)); //ERRORE PERCHE' L'ARRAYLIST E' STATO COMPLETAMENTE SVUOTATO


        /* ARRAYLIST 2D - Arraylist di ArrayList */
        //
        //
        //CREO UN ARRAYLIST CHE SARA' IL PADRE DEGLI ALTRI ARRAYLIST FIGLI
        //dischiaro l'arraylist, ne dichiaro un altro come fosse un tag, ne definisco il tipo, e lo nomino: ArrayLsit <ArrayList <Type_Variable>> nomeArray
        //creo un nuovo arrayList: new ArrayList()
        ArrayList <ArrayList<Integer>> numbers = new ArrayList();

        //creo ArrayList Figli a cui aggiungo dei valori [add()]
        ArrayList<Integer> numberOne = new ArrayList<Integer>();
        numberOne.add(10);
        numberOne.add(20);

        ArrayList<Integer> numberTwo = new ArrayList<Integer>();
        numberTwo.add(100);
        numberTwo.add(200);

        //aggiungo gli ArrayList Figli nell'ArrayList Padre
        numbers.add(numberOne);
        numbers.add(numberTwo);

        //ciclo l'ArrayList Padre per accedere agli ArrayList Figli: [array.size()] 
        //ciclo gli ArrayList Figli, in base all'indice del primo ciclo (i): [array.get(i).size()]
        //accedo al singolo ArrayList Figlio per leggerne il valore, in base all'indice del secondo ciclo (j): [array.get(i).get(j)]
        for(int i = 0; i < numbers.size(); i++){
            System.out.println();
            for(int j = 0; j < numbers.get(i).size(); j++){
                System.out.println(numbers.get(i).get(j));
            }
        }

    }
}
