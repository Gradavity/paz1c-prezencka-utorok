package sk.upjs.paz;

import java.time.LocalDateTime;
import java.util.List;

public record Prezencka(LocalDateTime datum, Predmet predmet, List<Student> studenti, Long id) {
}
