package sk.upjs.paz;

import java.util.ArrayList;
import java.util.List;

public record Predmet(Long id, String nazov, Integer rocnik, List<Student> studenti) {

}
