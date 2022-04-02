package com.demo.parabank.helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class ValueGenerator {

    public static String randomUsername() {
        return String.format("test-%s", RandomStringUtils.randomAlphabetic(6));
    }
}
