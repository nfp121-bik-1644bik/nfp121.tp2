package question2;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

    /** le point d'entr�e de cette application, 
     * dont le commentaire est � compl�ter
     *
     *  @param args ...
     */
    public static void main(String[] args){
        try{
            int numberParam = args.length; //number of items givin
            for (int i = 0; i< numberParam; i++){
                float celsius = fahrenheitEnCelsius(Integer.parseInt(args[i]));
                System.out.println(args[i] + "\u00B0F -> " + celsius + "\u00B0C");
            }
        }catch(NumberFormatException nfe){
            System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
        }

    }

    /** 
     * la m�thode � compl�ter. 
     *   @param f la valeur en degr� Fahrenheit
     *   @return  la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius( int f){
        float celcius = ((float)f - 32)*5/9;
        celcius = (float)(Math.round(celcius*10)/10.0);
        return celcius;    // � compl�ter    en rempla�ant la valeur retourn�e par la fonction de conversion
        // ...
    }

}
