package com.pandurang.designpattern.creational;

import com.pandurang.designpattern.creational.factory.builder.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserBuilderTest {

    @Test
    void shouldBuildUserWithAllFields() {

        User user = User.builder()
                .name("Pandurang")
                .email("pandurang@gmail.com")
                .age(30)
                .city("Pune")
                .country("India")
                .active(true)
                .build();

        assertNotNull(user);
    }
}
