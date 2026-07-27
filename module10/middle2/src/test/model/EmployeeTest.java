package test.model;


import main.model.Manager;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void shouldCalculateTotalSalaryCorrectly() {
        List<Double> bonuses = Arrays.asList(20_000.0);
        Manager manager = new Manager("Иван", "Иванов", 100_000.0, bonuses);

        double total = manager.calculateTotalSalary();
        assertEquals(120_000.0, total);
    }
}