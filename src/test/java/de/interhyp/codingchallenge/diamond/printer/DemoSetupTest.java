package de.interhyp.codingchallenge.diamond.printer;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoSetupTest {

    private DemoSetup cut = new DemoSetup();

    @Test
    void shouldEchoInput() {
        assertThat(cut.echo("HelloWorld!")).isEqualTo("HelloWorld!");
    }

    @Test
    void shouldEchoTextBlockInput() {
        final String input = """
            HelloWorld!
            From another line
            """;
        assertThat(cut.echo(input)).isEqualTo(input);
    }
}
