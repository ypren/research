package com.ypren.demo;

import java.io.ObjectStreamException;

/**
 * Switch expression test.
 * Added since java 12.
 */
public class SwitchExpression {

    public static void main(String[] args) {
        System.out.println(switchInJava8(Week.MONDAY));
        System.out.println(switchInJava17(Week.SATURDAY));
        switchPatternMatcher("hello, switch expression matcher.");
    }

    private enum Week {
        MONDAY, TUESDAY, WEDNESDAY ,THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // switch usage in java 8.
    public static String switchInJava8 (Week week) {
        System.out.println("switch usage in java 8.");
        switch (week) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                return "workday";
            case SATURDAY, SUNDAY:
                return "holiday";
            default:
                return "bad";
        }
    }

    // switch usage in java 17.
    public static String switchInJava17 (Week week) {
        System.out.println("switch usage in java 11.");
        return switch (week) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "workday";
            case SATURDAY, SUNDAY -> "holiday";
        };
    }

    /**
     * test switch pattern match.
     * This is preview function in Java 17.
     */
    public static void switchPatternMatcher(Object value) {
        if (value instanceof String) {
            String v = (String) value;
            System.out.println("Object: " + v);
        } else if (value instanceof Integer) {
            Integer i = (Integer) value;
            System.out.println("Object: " + i);
        }

        switch (value) {
            case String s -> System.out.println("Object: " + s);
            case Integer i -> System.out.println("Object: " + i);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }
}
