package org.csystem.math.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Circle {
    private double m_r;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius()
    {
        return m_r;
    }

    public void setRadius(double radius)
    {
        m_r = abs(radius);
    }

    public double getArea()
    {
        return PI * m_r * m_r;
    }

    public double getCircumference()
    {
        return 2 * PI * m_r;
    }

    public String toString()
    {
        return "Radius = %f, Area = %f, Circumference = %f".formatted(m_r, getArea(), getCircumference());
    }
}