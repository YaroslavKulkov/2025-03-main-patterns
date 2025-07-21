package ru.kulkov.equation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EquationSolverTest {
    private static Solver solver;
    @BeforeAll
    static void init(){
        solver = new EquationSolver();
    }

    @Test
    void solve_WhenAZeroBZeroCOne_ReturnsEmptyArray() {
        double[] actual = solver.solve(1, 0,1);
        double[] expected = new double[0];
        assertArrayEquals(expected, actual, "Должен вернуться пустой массив");
    }
}
