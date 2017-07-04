package com.github.xenteros;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by agurgul on 04.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        validate(s);
        System.out.println(s);
        validate("       ");
    }

    public static void validate(String s) {
        if (Strings.isNullOrEmpty(s)) {
            throw new IllegalArgumentException();
        }
        if (StringUtils.isBlank(s)) {
            throw new IllegalArgumentException();
        }

        if (s == null) {
            throw new IllegalArgumentException();
        }
        if (s.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
