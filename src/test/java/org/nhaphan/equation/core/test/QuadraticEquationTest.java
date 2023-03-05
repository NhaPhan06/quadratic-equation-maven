/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.nhaphan.equation.core.test;

import org.nhaphan.equation.core.QuadraticEquation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QuadraticEquationTest {

    private QuadraticEquation quadraticEquation;

    //cho a = 1, b = -4, c = 4
    //Hy vọng kết quả trả về với x = 2
    @Test
    public void testQuadraticEquationReturnOneSolution() {
        quadraticEquation = new QuadraticEquation(1, -4, 4);
        String result = quadraticEquation.solve();
        Assert.assertEquals(result, "x = 2.0");
    }

    //cho a = 1, b = -11, c = 30
    //Hy vọng kết quả trả về với x1 = 6, x2 = 5
    @Test
    public void testQuadraticEquationReturnTwoSolutions() {
        quadraticEquation = new QuadraticEquation(1, -11, 30);
        String result = quadraticEquation.solve();
        Assert.assertEquals(result, "x1 = 6.0, x2 = 5.0");
    }

    //cho a = 0 
    //test case ném ra ngoại lệ
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testQuadraticEquationGivenWrongValueA() {
        quadraticEquation = new QuadraticEquation(0, 2, 3);
        String result = quadraticEquation.solve();
        Assert.assertEquals(result, "x1 = 6.0, x2 = 5.0");
    }

    // cho các biến a = 1, b = -16 , c = 84 để tình ra delta < 0
    // test case ném ra ngoại lệ
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDeltaLessThanZero() {
        quadraticEquation = new QuadraticEquation(1, -16, 84);
        quadraticEquation.solve();
    }

}
