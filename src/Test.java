import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = generateDotPlacements(str);
        System.out.println(list);
    }

    public static List<String> generateDotPlacements(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        generateDotPlacementsRecursive(str, 0, "", result);
        return result;
    }

    private static void generateDotPlacementsRecursive(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }  if (index > 0) {
            generateDotPlacementsRecursive(str, index + 1, current + "." + str.charAt(index), result);
        }
        generateDotPlacementsRecursive(str, index + 1, current + str.charAt(index), result);
    }
}
