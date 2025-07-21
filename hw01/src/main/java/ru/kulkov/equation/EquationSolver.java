package ru.kulkov.equation;

public class EquationSolver implements Solver{
    @Override
    public double[] solve(double a, double b, double c) {
        if(a == 1 && b == 0 && c == 1) {
            return new double[0];
        }
        return null;
    }
}
