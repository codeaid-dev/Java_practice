import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String regex = "^\\+?\\d{1,3}-\\d{1,3}-\\d{1,4}-\\d{4,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("+81-90-123-4567890");
        System.out.println("有効な電話番号か: " + matcher.matches());
    }
}