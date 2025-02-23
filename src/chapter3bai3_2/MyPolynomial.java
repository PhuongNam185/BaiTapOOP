package chapter3bai3_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i < coeffs.length - 1 && coeffs[i] >= 0) {
                sb.append("+");
            }
            sb.append(coeffs[i]).append("x^").append(i).append(" ");
        }
        return sb.toString().trim();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] resultCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            if (i <= this.getDegree()) {
                resultCoeffs[i] += this.coeffs[i];
            }
            if (i <= right.getDegree()) {
                resultCoeffs[i] += right.coeffs[i];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int resultDegree = this.getDegree() + right.getDegree();
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }
}

