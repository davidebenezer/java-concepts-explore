package org.example;

import junit.framework.TestCase;
import org.junit.Test;


public class InterfaceShapeTest extends TestCase {
    @Test
    public void testRectangle(){
        InterfaceShape shape = new Rectangle("Red");
        assertEquals(shape.getShapeAndColor(), ((Rectangle)shape).getShapeAndColor());
        assert(shape instanceof Rectangle);
        assertFalse(shape instanceof ShapesOnlyHasLines);
    }

    @Test
    public void tesTriangle(){
        InterfaceShape shape = new Triangle("Orange");
        assertEquals(shape.getShapeAndColor(), ((Triangle)shape).getShapeAndColor());
        assert(shape instanceof Triangle);
        assert(shape instanceof ShapesOnlyHasLines) ;
    }
}