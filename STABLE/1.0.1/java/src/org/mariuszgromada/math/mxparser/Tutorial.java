/*
 * @(#)Tutorial.java        1.0    2010-01-27
 * 
 * You may use this software under the condition of "Simplified BSD License"
 * 
 * Copyright 2010 MARIUSZ GROMADA. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 * 
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 * 
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY <MARIUSZ GROMADA> ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of MARIUSZ GROMADA.
 * 
 * If you have any questions/bugs feel free to contact:
 * 
 *     Mariusz Gromada
 *     mariusz.gromada@gmail.com
 *     http://multifraktal.net/
 *     http://mxparser.sourceforge.net/
 * 
 *                              Asked if he believes in one God, a mathematician answered: 
 *                              "Yes, up to isomorphism."  
 */ 

package org.mariuszgromada.math.mxparser;


/**
 * Tutorial class.
 * 
 * @author         <b>Mariusz Gromada</b><br/>
 *                 <a href="mailto:mariusz.gromada@gmail.com">mariusz.gromada@gmail.com</a><br>
 *                 <a href="http://multifraktal.net/">http://multifraktal.net/</a><br>
 *                 <a href="http://mxparser.sourceforge.net/">http://mxparser.sourceforge.net/</a><br>
 *                         
 * @version        1.0
 * 
 * @see RecursiveArgument
 * @see Expression
 * @see Function
 * @see Constant
 */
public class Tutorial {

	public static void main(String[] args) {

		/*
		 * Tutorial for the mXparser version 1.0
		 * Mariusz Gromada    2010-01-10
		 */
		
			
		/*
		 * Simple & complex arithmetic expressions, large math functions collection
		 * User defined arguments, functions, constants 
		 * Calculus operations (i.e. differentiation, integration)
		 * Summation and product operations
		 * User defined recursive functions
		 * Boolean operators
		 * and many more...
		 * 
		 */
			
		/*
		 * Start from the license 
		 */
		Expression e = new Expression();
		System.out.println(e.getLicense());
		System.out.println();
		
		
		/*
		 * Using help
		 */
		System.out.println();
		System.out.println(e.getHelp());
		
		/*
		 * Full line searching
		 */
		System.out.println();
		System.out.println(e.getHelp("sine"));
		
		
		System.out.println();
		System.out.println(e.getHelp("inver"));
		
		
		/*
		 * Simple expression
		 */
		
		Expression e1 = new Expression("2+1");
		System.out.println(e1.getExpressionString() + " = " + e1.calculate());
		
		e1.setExpressionString("2-1");
		System.out.println(e1.getExpressionString() + " = " + e1.calculate());
		
		
		
		/* operators */
		Expression e2 = new Expression("2-(32-4)/(23+(4)/(5))-(2-4)*(4+6-98.2)+4");
		System.out.println(e2.getExpressionString() + " = " + e2.calculate());
		
		/* power function */
		Expression e3 = new Expression("2^3+2^(-3)+2^3^(-4)");
		System.out.println(e3.getExpressionString() + " = " + e3.calculate());
		
		/*
		 * Relations
		 */
		Expression e4 = new Expression("2=3");
		System.out.println(e4.getExpressionString() + " = " + e4.calculate());
		
		Expression e5 = new Expression("2<3");
		System.out.println(e5.getExpressionString() + " = " + e5.calculate());
		
		Expression e6 = new Expression("(2=3) | (2<3)");
		System.out.println(e6.getExpressionString() + " = " + e6.calculate());
		
		Expression e7 = new Expression("(2=3) & (2<3)");
		System.out.println(e7.getExpressionString() + " = " + e7.calculate());
		
		/* 1 arg functions */
		
		Expression e8 = new Expression("sin(2)-cos(3)");
		System.out.println(e8.getExpressionString() + " = " + e8.calculate());
		
		/* 2 args functions */
		
		Expression e9 = new Expression("min(3,4) + max(-2,-1)");
		System.out.println(e9.getExpressionString() + " = " + e9.calculate());
		
		/* binomial coefficient */
		Expression e10 = new Expression("C(10,5)");
		System.out.println(e10.getExpressionString() + " = " + e10.calculate());
		
		/* 3 args functions */
		
		/* conditions */
		Expression e11 = new Expression("if(2<3,1,0)");
		System.out.println(e11.getExpressionString() + " = " + e11.calculate());
		
		Expression e12 = new Expression("if(3<2,1,0)");
		System.out.println(e12.getExpressionString() + " = " + e12.calculate());
		
		Expression e13 = new Expression("if(3<2, 1, if(1=1, 5, 0) )");
		System.out.println(e13.getExpressionString() + " = " + e13.calculate());
		
		/*
		 * Free Arguments
		 */
		
		Argument x = new Argument("x", 1);
		Argument y = new Argument("y", 2);
		Argument z = new Argument("z", 3);
		Argument n = new Argument("n", 4);
		
		Expression e14 = new Expression("sin(x+y)-cos(y/z)", x, y, z);
		System.out.println(e14.getExpressionString() + " = " + e14.calculate());
		
		Expression e15 = new Expression("if(x>y, x-z, if(y<z, sin(x+y), cos(z)) )", x, y, z);
		System.out.println(e15.getExpressionString() + " = " + e15.calculate());
		
		x.setArgumentValue(5);
		System.out.println(x.getArgumentName() + " = " + x.getArgumentValue());
		
		/*
		 * Dependent arguments
		 */
		
		y = new Argument("y","2*x+5", x);
		System.out.println(y.getArgumentName() + " = " + y.getArgumentValue());
		
		y = new Argument("y","sin(y)-z", y, z);
		System.out.println(y.getArgumentName() + " = " + y.getArgumentValue());
		
		/* syntax checking */
		y.setArgumentExpressionString("n*sin(y)-z");
		System.out.println(y.getArgumentName() + " = ... \n syntax = " + y.checkSyntax() + "\n message = \n" + y.getErrorMessage());
		
		y.addArguments(n);
		System.out.println(y.getArgumentName() + " = ... \n syntax = " + y.checkSyntax() + "\n message = \n" + y.getErrorMessage());
		System.out.println(y.getArgumentName() + " = " + y.getArgumentValue());
		
		/*
		 * the same methods could be called
		 * for the expression syntax checking
		 * 
		 */
		
		/*
		 * Complex expressions
		 */
		
		/*
		 * Summation operator SIGMA
		 * sum(index, from, to, expr)
		 * sum(index, from, to, expr, by)
		 * 
		 */
		
		Expression e16 = new Expression("sum(i,1,10,i)");
		System.out.println(e16.getExpressionString() + " = " + e16.calculate());
		
		Expression e17 = new Expression("sum(i,1,10,i,0.5)");
		System.out.println(e17.getExpressionString() + " = " + e17.calculate());
		
		
		/*
		 * Product operator SIGMA
		 * prod(index, from, to, expr)
		 * prod(index, from, to, expr, by)
		 */
		
		/* factorial */
		Expression e18 = new Expression("prod(i,1,5,i)");
		System.out.println(e18.getExpressionString() + " = " + e18.calculate());
		
		Expression e19 = new Expression("prod(i,1,5,i,0.5)");
		System.out.println(e19.getExpressionString() + " = " + e19.calculate());
		
		/* Approximation sin(x) by Taylor series
		 * ! - factorial
		 */
		
		Expression e20 = new Expression("sin(x)-sum(n,0,10,(-1)^n*(x^(2*n+1))/(2*n+1)!)", x);
		
		x.setArgumentValue(1);
		System.out.println("x = " + x.getArgumentValue() + ", " + e20.getExpressionString() + " = " + e20.calculate());
		x.setArgumentValue(5);
		System.out.println("x = " + x.getArgumentValue() + ", " + e20.getExpressionString() + " = " + e20.calculate());
		x.setArgumentValue(10);
		System.out.println("x = " + x.getArgumentValue() + ", " + e20.getExpressionString() + " = " + e20.calculate());
		
		/*
		 * calculating pi by integral of
		 * sqrt(1-x^2) from -1 to 1
		 * using simple summation operator
		 */
		
		Argument d = new Argument("d",0.1);
		Expression e21 = new Expression("2*sum(x, -1, 1, d*sqrt(1-x^2), d)", d);
		System.out.println("d = " + d.getArgumentValue() + ", " + e21.getExpressionString() + " = " + e21.calculate());
		d.setArgumentValue(0.01);
		System.out.println("d = " + d.getArgumentValue() + ", " + e21.getExpressionString() + " = " + e21.calculate());
		
		
		/*
		 * Derivatives
		 *
		 * der( f(x,...), x) - general
		 * der+( f(x,...), x) - right
		 * der-( f(x,...), x) - left
		 */
		
		/* cos(x) as derivative from sin(x) */
		Expression e22 = new Expression("cos(x)-der(sin(x), x)", x);
		System.out.println(e22.getExpressionString() + " = " + e22.calculate());
		
		/* left and right derivative from |x| */		
		x.setArgumentValue(0);
		Expression e23 = new Expression("der-(abs(x), x)", x);
		System.out.println("x = " + x.getArgumentValue() + ", " + e23.getExpressionString() + " = " + e23.calculate());
		Expression e24 = new Expression("der+(abs(x), x)", x);
		System.out.println("x = " + x.getArgumentValue() + ", " + e24.getExpressionString() + " = " + e24.calculate());
		
		/* derivative from sin(x) as Taylor series (approximation) */
		x.setArgumentValue(1);
		
		Expression e25 = new Expression("cos(x)-der(sum(n,0,10,(-1)^n*(x^(2*n+1))/(2*n+1)!), x)", x);
		
		x.setArgumentValue(1);
		System.out.println("x = " + x.getArgumentValue() + ", " + e25.getExpressionString() + " = " + e25.calculate());
		x.setArgumentValue(5);
		System.out.println("x = " + x.getArgumentValue() + ", " + e25.getExpressionString() + " = " + e25.calculate());
		x.setArgumentValue(10);
		System.out.println("x = " + x.getArgumentValue() + ", " + e25.getExpressionString() + " = " + e25.calculate());
		
		/*
		 * Integral
		 * int(f(x,...), x, a, b)
		 */
		
		/* calculating PI value */
		
		Expression e26 = new Expression("2*int(sqrt(1-x^2), x, -1, 1)");
		System.out.println(e26.getExpressionString() + " = " + e26.calculate());
		
		
		/*
		 * Parser constants
		 */
		
		Expression e27 = new Expression("pi");
		System.out.println(e27.getExpressionString() + " = " + e27.calculate());
		Expression e28 = new Expression("e");
		System.out.println(e28.getExpressionString() + " = " + e28.calculate());
		
		/* and many many more ...  */
		
		/*
		 * USER DEFINED FUNCTIONS
		 * f(x,y) = sin(x+y)
		 * f(a,b,c,d,...) = ....
		 */
		
		Function f = new Function("f", "x^2", "x");
		Expression e29 = new Expression("f(2)");
		e29.addFunctions(f);
		System.out.println(e29.getExpressionString() + " = " + e29.calculate());
		
		
		/*
		 * Please be informed that sequence of
		 * arguments names is important. In the below exampe
		 * a - 1st argument of f
		 * b - 2nd argument of f
		 * c - 3rd argument of f
		 * 
		 * In the expressions f will be c alled as f( . , . , . )
		 */
		
		f = new Function("f", "a+b+c", "a", "b", "c");
		Expression e30 = new Expression("f(1, 2, 3)");
		e30.addFunctions(f);
		System.out.println(e30.getExpressionString() + " = " + e30.calculate());
		
		
		/*
		 * Using functions in functions
		 */
		f = new Function("f", "x^2", "x");
		Function g = new Function("g", "f(x)^2", "x");
		g.addFunctions(f);
		System.out.println("g(2) = " + g.calculate(2));
		
		Expression e31 = new Expression("f(x)+g(2*x)", x);
		e31.addFunctions(f, g);
		System.out.println("x = " + x.getArgumentValue() + ", " + e31.getExpressionString() + " = " + e31.calculate());
		
		x.setArgumentValue(2);
		Expression e32 = new Expression("der(g(x),x)", x);
		e32.addFunctions(g);
		System.out.println("x = " + x.getArgumentValue() + ", " + e32.getExpressionString() + " = " + e32.calculate());
		
		/*
		 * Fundamental theorem of calculus
		 * if F(x) = int_a^x f(t) dt
		 * then F'(x) = f(x)
		 */
		
		f = new Function("f", "sin(x)", "x");
		Function F = new Function("F", "int(f(t), t, 0, x)", "x");
		F.addFunctions(f);
		Expression e33 = new Expression("f(x) - der(F(x),x)", x);
		e33.addFunctions(f, F);
		System.out.println("x = " + x.getArgumentValue() + ", " + e33.getExpressionString() + " = " + e33.calculate() +
				", computing time : " + e33.getComputingTime() + " s.");
		
		/*
		 * Simple (fast) recursion
		 * Only one index n >= 0, n integer
		 */
		
		
		/* Fibonacci numbers with add base cases method*/
		n = new Argument("n");
		RecursiveArgument fib1 = new RecursiveArgument("fib1", "fib1(n-1)+fib1(n-2)", n);
		fib1.addBaseCase(0, 0);
		fib1.addBaseCase(1, 1);
		
		System.out.println("fib1: ");
		for (int i = 0; i <= 10; i++ )
			System.out.print(fib1.getArgumentValue(i) + ", ");
		System.out.println();
		
		/* Fibonacci numbers with if statement*/
		RecursiveArgument fib2 = new RecursiveArgument("fib2", "if( n>1, fib2(n-1)+fib2(n-2), if(n=1,1,0) )", n);
		System.out.println("fib2: ");
		for (int i = 0; i <= 10; i++ )
			System.out.print(fib2.getArgumentValue(i) + ", ");
		System.out.println();
		
		Expression e34 = new Expression("sum(i, 0, 10, fib1(i))", fib1);
		System.out.println(e34.getExpressionString() + " = " + e34.calculate() +
				", computing time : " + e34.getComputingTime() + " s.");
		
		Expression e35 = new Expression("sum(i, 0, 10, fib2(i))", fib2);
		System.out.println(e35.getExpressionString() + " = " + e35.calculate() +
				", computing time : " + e35.getComputingTime() + " s.");
		
		
		/*
		 * Complex recursion (slow)
		 * any definition
		 * 
		 * 
		 */
		
		/* Fibonacci numbers using complex recursion */
		Function fib3 = new Function("fib3","if(n>1, fib3(n-1)+fib3(n-2), if(n>0,1,0))", "n");
		fib3.setRecursiveMode();
		System.out.println("fib2: ");
		for (int i = 0; i <= 10; i++ )
			System.out.print(fib3.calculate(i) + ", ");
		System.out.println();
		
		Expression e36 = new Expression("sum(i, 0, 10, fib3(i))");
		e36.addFunctions(fib3);
		System.out.println(e36.getExpressionString() + " = " + e36.calculate() +
				", computing time : " + e36.getComputingTime() + " s.");
		
		/*
		 * Chebyshev polynomials definition using
		 * recursive functions
		 */
		Function T = new Function("T","if(n>1, 2*x*T(n-1,x)-T(n-2,x), if(n>0, x, 1) )", "n", "x");
		T.setRecursiveMode();
		Argument k = new Argument("k", 5);
		Expression e37 = new Expression("T(k,x) - ( (x + sqrt(x^2-1))^k + (x - sqrt(x^2-1))^k)/2", k, x);
		e37.addFunctions(T);
		System.out.println(e37.getExpressionString() + " = " + e37.calculate() +
				", computing time : " + e37.getComputingTime() + " s.");
		
		
		/*
		 * Binomial coefficient using complex recursion 
		 */
		Function Cnk = new Function("Cnk","if( k>0, if( k<n, Cnk(n-1,k-1)+Cnk(n-1,k), 1), 1)","n", "k");
		Cnk.setRecursiveMode();
		
		Expression e38 = new Expression("C(10,5) - Cnk(10,5)");
		e38.addFunctions(Cnk);
		
		System.out.println(e38.getExpressionString() + " = " + e38.calculate() +
				", computing time : " + e38.getComputingTime() + " s.");
		
		/*
		 * Differences between simple and complex recursion
		 *
		 * Simple:
		 * 
		 * Advantages
		 *    1) fast
		 *    2) remembers what was previously calculated
		 *    3) calculations are done in a controlled way
		 *         - recursion counter (each recursion step increases
		 *           recursion counter, for calculating n-th recursion
		 *           value maximum n recursion steps are needed
		 *         - no negative indexes
		 *    4) add base value method
		 *    
		 * Disadvantages
		 *    1) limited to one index argument (positive integer index argument)
		 *    
		 * Complex recursion
		 * 
		 * Advantages
		 *    1) flexible - no limitations
		 *    
		 * Disadvantages
		 *    1) slow
		 *    2) no add base values method
		 */
		
		
		/*
		 * User defined constants
		 */
		
		Constant a = new Constant("a", 5);
		Constant b = new Constant("b", 10);
		Constant c = new Constant("c", 15);
		
		Expression e39 = new Expression("a+b+c");
		e39.addConstants(a, b, c);
		
		/*
		 * For example in verbose mode
		 * computing
		 */
		e39.setVerboseMode();
		e39.checkSyntax();
		System.out.println();
		System.out.println(e39.getErrorMessage());
		System.out.println(e39.getExpressionString() + " = " + e39.calculate() +
				", computing time : " + e39.getComputingTime() + " s.");
		
		
		/*
		 * There are much more other features in the mXparser API.
		 * Please refer to the API specifications.
		 * 
		 * Please be aware that this is the version 1.0 of the parser
		 * - I am pretty sure you will find some bugs - if so please send me
		 * more info: mariusz.gromada@gmail.com 
		 */
	
	}

}