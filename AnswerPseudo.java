
/**
 * Created by RaviG on 01/08/2015.
 */
public class AnswerPseudo {

    /**
     *This method append given string with random number between 6 to 15 and return this new string
     * @param name This is input String
     * @return String This method return String in "name [random number between 6-15]"
     */
    public static String generateRandom(String name){

        int randomNo = 6 + (int)Math.round(Math.random()*10);

        return name+" "+randomNo;

    }


    /**
     * Main method to test program
     * @param args
     */
    public static void main(String[] args){
        System.out.println(generateRandom("Encircle"));
    }
}
