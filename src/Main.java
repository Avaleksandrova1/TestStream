import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("khhjk vjv");
        list.add("xbf  ");
        list.add(" ");
        list.add("sddff");
        list.add("sv");
        list.add("hjvhvj hgj");
        list.add("jkbk");
        list.add("vhjhj");
        list.add("bvjj");
        list.add("gchvg  ");
        list.stream()
                .flatMap(Pattern.compile(" ")::splitAsStream)
                .map(value->value+": " + value.length())
                .forEach(System.out::printf);

    }


}