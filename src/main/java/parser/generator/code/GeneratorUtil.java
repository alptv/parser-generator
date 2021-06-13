package parser.generator.code;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GeneratorUtil {
    public static  <E> String joinWithComma(List<E> list, Function<E, String> toString) {
        return list.stream().map(toString).collect(Collectors.joining(", "));
    }

}
