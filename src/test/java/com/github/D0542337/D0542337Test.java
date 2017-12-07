package com.github.D0542337;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class D0542337Test {

    public class TriangleTest {
        @Test
        public void getTypeNoTriangle() throws Exception {
            // Arrange
            D0542337 triangle = new D0542337(5, 10, 5);

            /* Act */
            String result = triangle.getType();

            // Assert
            Assert.assertEquals("不是三角形", result);
        }

    }

}
