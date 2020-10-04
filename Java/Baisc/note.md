## Primitive Types

```
Type  Bytes Range

Bytes	1   [-128,127]
short	2   [-32k,32k]
int		4   [-2B,1B]
long	8
float	4
double	8
char	2   A,B,C...
boolean 1   true/false
```

### Declaring primitive type variables in Java

> primitive type to use for simple value

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
        byte age = 30;
	    long viewsCount = 3_123_456_789L; //To use for long 
	    float price = 10.99F; //to use for floar
	    char letter = 'A'; // single quote
	    boolean isEligible = false;
	    
    }
}
```

> primitives type copy by the values

### Declaring reference type variables in Java 

> reference to use for complex objects

```
package com.osibyte;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
		byte age = 30;
		Date now = new Date();
		System.out.println(now);

    }
}
```

> reference type copied by the references

```
package com.osibyte;

import java.awt.*;


public class Main {

    public static void main(String[] args) {
		Point point1 = new Point(1,1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
    }
}
```

Result

```
java.awt.Point[x=2,y=1]
```

### Escape Squences

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	String message1 = "Hello \"chan\"";
		String message2 = "C:\\Users\\administrator\\flag";
		System.out.println(message1);
		System.out.println(message2);

    }
}
```

### Arrays

```
package com.osibyte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[] numbers = new int[5];
    	numbers[0] = 1;
    	numbers[1] = 2;

		System.out.println(Arrays.toString(numbers));

    }
}
```

```
package com.osibyte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[] numbers = { 2, 3, 5, 1, 4};
		System.out.println(numbers.length);
    }
}
```

Sorting arrays 

```
package com.osibyte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[] numbers = { 2, 4, 5, 1, 3};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

    }
}
```

### Multidimensional Arrays

```
package com.osibyte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[][] numbers = new int[2][3];
    	numbers[0][0] = 1;
		System.out.println(Arrays.deepToString(numbers));

    }
}
```

```
package com.osibyte;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[][] numbers = { { 1, 2, 3}, {4, 5, 6} };
    	numbers[0][0] = 1;
		System.out.println(Arrays.deepToString(numbers));

    }
}

```

### Arithematic Expressions

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	int adding =  10 + 3;
    	double division = (double)10 / (double)3;
    	int x = 1;
    	x++;
		System.out.println(adding);
		System.out.println(division);
		System.out.println(x);

    }
}
```

### Order Of Operations

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	int x = (10 + 3) * 2;
		System.out.println(x);

    }
}
```

### Casting

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	// Implicit casting
		// Bytes > short > int > long > float > double
    	double x = 1.1;
    	int y = (int)x + 2;
		System.out.println(y);

    }
}
```

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	// Implicit casting
		// Bytes > short > int > long > float > double
    	String x = "1";
    	int y = Integer.parseInt(x) + 2;
		System.out.println(y);

    }
}
```

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	// Implicit casting
		// Bytes > short > int > long > float > double
    	String x = "1.1";
    	double y = Double.parseDouble(x) + 2;
		System.out.println(y);

    }
}
```

### formating numbers

#### Currency

```
package com.osibyte;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(123456.891);
		System.out.println(result);

    }
}
```

#### Percent

```
package com.osibyte;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		String result = percent.format(0.1);
		System.out.println(result);

    }
}
```
#### Another method for percent
```
package com.osibyte;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

		String result = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result);

    }
}
```

### Reading Input 

> Byte
```
package com.osibyte;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		byte age = scanner.nextByte();
		System.out.println("You are " + age);

    }
}
```

> Name
```
package com.osibyte;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name?: ");
		String name = scanner.nextLine();
		System.out.println("My name is" + name);

    }
}
```

### Mortgage Calculator

Question 
```
Principal: 10000
Annual Interet Rate: 3.92
Period (Years): 30
Morgage: 
```

```
package com.osibyte;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	final byte months = 12;
    	final byte percent = 100;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Principal: ");
		int principal = scanner.nextInt();


		System.out.print("Annual Interest Rate: ");
		float rate = scanner.nextFloat();
		float monthlyInterest = rate / percent / months;



		System.out.print("Period (Years): ");
		byte years = scanner.nextByte();
		int numberOfPayments =  years * months;


		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest , numberOfPayments) / (Math.pow(1 + monthlyInterest ,numberOfPayments) - 1));

		String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageformatted);



    }
}
```

### Control Flow

- Comparison Operators 
- Logical Operators
- Conditional statements
- Loops

#### Comparison Operators

> to compare primitive values

```
! <= => ==
```

#### Logical Operators

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	int temp = 22;
    	boolean isWarm = temp > 20 && temp < 30;
		System.out.println(isWarm);
    }
}
```

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	boolean hasHighIncome = true;
    	boolean hasGoodGrade = true;
    	boolean hasCriminalRecord = false;
    	boolean isEligible = (hasHighIncome || hasGoodGrade) && !hasCriminalRecord ;
		System.out.println(isEligible);
    }
}
```

#### If Statements

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	int temp = 32;
    	if (temp > 30) {
			System.out.println("It's a hot day");
			System.out.println("Drink Water");
		}
    	else if (temp > 20 )
			System.out.println("Beautiful Day");
		else
			System.out.println("Cold Day");
    }
}
```

#### Simplifying If Statements

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	int income = 120_000;
    	boolean hasHighIncome = (income > 100_000);
    	
    }
}
```

#### The Ternary Operator

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	int income = 120_000;
    	String className = income > 100_000 ? "First" : "Economy";
		System.out.println(className);
    }
}
```

#### Switch Statements

```
package com.osibyte;

public class Main {

    public static void main(String[] args) {
    	String role = "admin";

    	switch (role) {
			case "admin":
				System.out.println("You are admin");
				break;

			case "moderator":
				System.out.println("You are a moderator");
				break;

			default:
				System.out.println("You are a guest");
		}
    	if (role == "admin")
			System.out.println("You are admin");
    	else if (role == "moderator")
			System.out.println("You are a moderator");
    	else
			System.out.println("You are a guest");
    }
}
```

#### FizzBuzz
```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Numbers: ");
		int number = scanner.nextInt();

		if (number % 5 == 0  && number % 3 == 0)
			System.out.println("FizzBuzz");
		else if (number %3 == 0)
			System.out.println("Buzz");
		else if (number % 5 == 0)
			System.out.println("Fizz");
		else
			System.out.println(number);
    }
}
```

#### for loops

> for (int i = 0; i < 5; i++)  // basic structure of for loop

```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			System.out.println("hello World");
    }
}
```

#### While loops

```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		for (int i = 5; i > 0; i--)
			System.out.println("hello World" + i);
		int i = 0;
		while (i > 0) {
			System.out.println("hello World" + i);
			i--;
		}
    }
}
```

```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("quit")) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
    }
}
```

#### Do while loops

> do whie loop execute once 

```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("quit")) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
		do {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
    }
}
```

#### Break and continue

```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				break;
			System.out.println(input);
		};
    }
}
```

#### For Each Loop

```
package com.osibyte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	String[] fruits = { "Apple", "Mango" , "Orange" };

    	for (int i = 0; i < fruits.length; i++)
			System.out.println(fruits[i]);
    	for (String fruit : fruits)
			System.out.println(fruit);
	}
}
```

#### Mortgage Calculator

```
package com.osibyte;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final byte months = 12;
		final byte percent = 100;

		int principal = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number between 1,000 and 1,000,000");
		while (true) {
			System.out.print("Principal ($1K - $1M): ");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <= 1_000_000)
				break;
			System.out.println("Enter a number between 1,000 and 1,000,000");

		}
		float rate = 0;
		float monthlyInterest = 0;

		while (true) {
			System.out.print("Annual Interest Rate: ");
			rate = scanner.nextFloat();
			monthlyInterest = rate / percent / months;
			if (rate > 0 && rate <= 30)
				break;
			System.out.println("Enter a value greater than 0 and less than or equal 30");
		}


		System.out.print("Period (Years): ");
		byte years = scanner.nextByte();
		int numberOfPayments =  years * months;


		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest , numberOfPayments) / (Math.pow(1 + monthlyInterest ,numberOfPayments) - 1));

		String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageformatted);
		
	}
}
```
