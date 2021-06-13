package parser.generator.code;

import java.io.IOException;

public class GenerationException extends IOException {
    public GenerationException(final String message, final Exception cause) {
        super(message, cause);
    }

    public GenerationException(final String message) {
        super(message);
    }
}
