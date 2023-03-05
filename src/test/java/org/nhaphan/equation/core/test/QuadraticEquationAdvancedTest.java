/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.nhaphan.equation.core.test;

import org.nhaphan.equation.core.QuadraticEquation;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author PhongNha
 */
public class QuadraticEquationAdvancedTest {
    private QuadraticEquation quadraticEquation;
    


    
    // Test lại các trường hợp phía trên bằng cách sử dụng mảng 2 chiều 
    // Sử dựng phương thức DataProvider được gán tên là equations để truyền vào một Object mảng 2 chiểu
    // bao gồm 3 biến a b c và 1 biến mong đợi
    @DataProvider(name = "equations")
    public Object[][] equations() {
        return new Object[][]{
            {1, -4, 4, "x = 2.0"},
            {1, -11, 30, "x1 = 6.0, x2 = 5.0"},
        };
    }
    
    //gọi tới dataprovider băng tên 
    // testNG tự động gán vào trong hàm test
    @Test(dataProvider = "equations")
    public void testSolveWithMultipleEquations(double a, double b, double c, String expected) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        String result = quadraticEquation.solve();
        Assert.assertEquals(result, expected);
    }
    
}
