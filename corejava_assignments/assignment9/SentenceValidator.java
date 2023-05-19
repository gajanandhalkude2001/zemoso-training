package corejava_assignments.assignment9;
import java.util.regex.*;

    public class SentenceValidator
    {
        public static void main(String[] args)
        {
            String sentence = "Good Morning.";
            Pattern pattern = Pattern.compile("^[A-Z].*[.]$");
            Matcher matcher = pattern.matcher(sentence);
            boolean isValid = matcher.matches();
            System.out.println("Is sentence valid? " + isValid); // Output: Is sentence valid? true
        }
    }
