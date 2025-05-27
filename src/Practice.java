import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
List<String> names = List.of("John Doe", "Lane Doe","John Smith", "Lane Smith");
List<String> aNames = names.stream()
        .filter(name -> name.startsWith("S"))
        .collect(Collectors.toList());



public static void main(String[] args) {
    Practice practice = new Practice();
    System.out.println(practice.aNames);
}
}
