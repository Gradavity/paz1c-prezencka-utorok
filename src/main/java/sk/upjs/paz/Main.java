package sk.upjs.paz;

import lombok.With;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world!");
        var student = new Student(
                1L,
                "Jan",
                "Mrkva",
                Sex.MALE,
                LocalDate.of(2005, 9, 30)
        );
    }
}
