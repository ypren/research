package com.ypren.demo;

import java.util.Objects;

/**
 * Test record.
 * Which added since java 14.
 */
public class Record {
    public static void main(String[] args) {
        Student s = new Student("Yongping", "Ren", "yongping@qti.qualcomm.com", 33);
        Student s1 = new Student("Yongping", "Ren", "yongping@qti.qualcomm.com", 33);
        System.out.println(s.firstName());
        System.out.println(s.equals(s1));
    }

    public record Student(String firstName,
                          String lastName,
                         String email,
                         int age) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age
                    && firstName.equals(student.firstName)
                    && lastName.equals(student.lastName)
                    && Objects.equals(email, student.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, email, age);
        }
    }
}
