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
    void solve_WhenAOneBZeroCOne_ReturnsEmptyArray() {
        //Написать тест, который проверяет, что для уравнения x^2+1 = 0 корней нет (возвращается пустой массив)
        double[] actual = solver.solve(1, 0,1);
        double[] expected = new double[0];
        assertArrayEquals(expected, actual, "Должен вернуться пустой массив");
    }

    @Test
    void solve_WhenAOneBZeroCMinusOne_ReturnsRoots(){
        //Написать тест, который проверяет, что для уравнения x^2-1 = 0 есть два корня кратности 1 (x1=1, x2=-1)
        double[] actual = solver.solve(1, 0,-1);
        double[] expected = new double[]{1, -1};
        assertArrayEquals(expected, actual, "Должны быть получены корни (x1=1, x2=-1)");
    }
}
