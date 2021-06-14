package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int numberParam = args.length; //number of items givin
        for (int i = 0; i< numberParam; i++){
            float celsius = fahrenheitEnCelsius(Integer.parseInt(args[i]));
            System.out.println(args[i] + "\u00B0F -> " + celsius + "\u00B0C");
        }                                                                       
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float celcius = ((float)f - 32)*5/9;
        celcius = (float)(Math.round(celcius*10)/10.0);
        return celcius; // à compléter en remplaçant ce return 0.F par la fonction
        // de conversion
    }

}
