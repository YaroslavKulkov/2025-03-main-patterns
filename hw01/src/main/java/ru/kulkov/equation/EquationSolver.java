package ru.kulkov.equation;

public class EquationSolver implements Solver{

    private static final double EPSILON = 1e-10;

    @Override
    public double[] solve(double a, double b, double c) {
        double d = findDiscriminant(a, b, c);

        if (d < 0) {
            return new double[0];
        }
        if (Math.abs(d) <= EPSILON) {
            double root = -b / (2 * a);
            return new double[]{root, root};
        }

        double root1 = (-b + Math.sqrt(d)) / 2 * a;
        double root2 = (-b - Math.sqrt(d)) / 2 * a;
        return new double[] {root1, root2};

    }

    protected double findDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
