package de.interhyp.codingchallenge.diamond.printer;


import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoSetupTest {

    private DemoSetup cut = new DemoSetup();

    @Test
    void shouldEchoInput() {
        assertThat(cut.echo("HelloWorld!")).isEqualTo("HelloWorld!");
    }
}
