W3 Basic Exercises

https://www.w3resource.com/java-exercises/basic/index.php

### Write a Java program that takes two numbers as input and display the product of two numbers. 
- Test Data:
- Input first number: 25
- Input second number: 5
- Expected Output :
- 25 x 5 = 125

```
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Input first number: ");
  byte num1 = scanner.nextByte();
  System.out.print("Input second number: ");
  byte num2 = scanner.nextByte();
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

 }
}
```

### Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
- Test Data:
- Input first number: 125
- Input second number: 24
- Expected Output :
- 125 + 24 = 149
- 125 - 24 = 101
- 125 x 24 = 3000
- 125 / 24 = 5
- 125 mod 24 = 5

```
package com.osibyte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Input second number: ");
		int num2 = scanner.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));


	}
}
```



### Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
- Test Data:
- Input a number: 8
- Expected Output :
- 8 x 1 = 8
- 8 x 2 = 16
- 8 x 3 = 24
- ...
- 8 x 10 = 80

```
package com.osibyte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));
		}
	}
}
```

### Write a Java program to compute a specified formula. Go to the editor
- Specified Formula :
- 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
- Expected Output
- 2.9760461760461765

```
package com.osibyte;

public class Main {

	public static void main(String[] args) {
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
	}
}
```
### Write a Java program to print the area and perimeter of a circle. Go to the editor
- Test Data:
- Radius = 7.5
- Expected Output
- Perimeter is = 47.12388980384689
- Area is = 176.71458676442586 

> PI value is 3.14159. But can use Math.PI in java

```
package com.osibyte;

public class Main {

	public static void main(String[] args) {
		double radius = 7.5;
		double pi = Math.PI;
		double perimeter = 2 * pi * radius;
		double area = pi * radius * radius;
		System.out.println("Radius = " + radius);
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}
}
```

### Write a Java program that takes five numbers as input to calculate and print the average of the numbers.

```
package com.osibyte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input First Number: ");
		int num1 = scanner.nextInt();

		System.out.print("Input Second Number: ");
		int num2 = scanner.nextInt();

		System.out.print("Input Third Number: ");
		int num3 = scanner.nextInt();

		System.out.print("Input Fourth Number: ");
		int num4 = scanner.nextInt();

		System.out.print("Input Fifth Number: ");
		int num5 = scanner.nextInt();

		System.out.println("Average = " + (num1 + num2 + num3 + num4 + num5 / 5));

	}
}
```

### Write a Java program to print the area and perimeter of a rectangle. Go to the editor
- Test Data:
- Width = 5.5 Height = 8.5
- 
- Expected Output
- Area is 5.6 * 8.5 = 47.60
- Perimeter is 2 * (5.6 + 8.5) = 28.20 

```
package com.osibyte;

public class Main {

	public static void main(String[] args) {
		double width = 5.6;
		double height = 8.5;
		double area = width * height;
		double perimeter = 2 * (width + height);
		System.out.println("Area is 5.6 * 8.5 = " + area);
		System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + perimeter);

	}
}
```
