
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        switch (input)
        {
            case "Alice":
            result = "Hello Alice";
            break;
            case "Bob":
            result = "Hello Bob";
            break;
            case "Alicia":
            result = "I DON'T KNOW YOU, YOU ARE SCARY";
            break;
            case "Bobert":
            result = "I DON'T KNOW YOU, YOU ARE SCARY";
            break;
            default:
            result = "Nothing";
            break;
        }
        return result;
    }
}
