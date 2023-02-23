/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nhaphan.equation.core;

/**
 *
 * @author PhongNha
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Thuật toán giải phương trinhf 2 nghiệm
    //
    public String solve() {
        double delta = b * b - 4 * a * c;

        // a = 0 thì phương trình ném ra ngoại lệ
        // Delta < 0 thì phương trình vô nghiệm => ném ra ngoại lệ
        if (a == 0) {
            throw new IllegalArgumentException("Invalid a. Variable a cannot be equal to 0.");
        } else if (delta < 0) {
            throw new IllegalArgumentException("Equation has no solution.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        }
    }
}

