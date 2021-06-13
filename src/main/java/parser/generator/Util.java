package parser.generator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {


    public static <E> String joinLines(final List<E> objects) {
        return objects
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    public static <E> String joinLines(final String header, final List<E> objects) {

        return header + System.lineSeparator() + objects
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @SafeVarargs
    public static <E> String joinLines(final String header, final E... objects) {
        return joinLines(header, Arrays.asList(objects));
    }

    @SafeVarargs
    public static <E> String joinLines(E... objects) {
        return joinLines(Arrays.asList(objects));
    }


}

