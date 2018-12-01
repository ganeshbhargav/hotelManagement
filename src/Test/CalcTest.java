package Test;

import org.junit.*;

import domain.login.Calc;

import static org.junit.Assert.*;
public class CalcTest
{
@Test 
public void testAdd() {
	assertTrue ("abc", (5 == Calc.add (2, 3)));
	assertTrue ("THIS IS WORKING", true);
}
}