# Introduction

I was learning PHP in past and almost forgot most of the things. The only thing that is I can read the codes. So just wanna make a note in here for learning PHP again!

## PHP Notes

### Variables in PHP

In php vriable is assigned by following

```
<?php
$myName = "Chan";
$age = "20";
echo "There once was a man named $myName <br>";
echo "He was $age years old <br>";
echo "He like the name $myName <br>";
echo "But didn't like being $age";

?>
```
### Data Types in PHP

```
<?php
$phrase = "To be or not to be"; //string
$age = 20; //number
$gpa = 3.0; // float
$isMale = true; //boolean

?>
```

### Working With Strings

```
Index start with 0

$string[0] it will print the first character of the string

str_replace function takes three arguments

like The first argument search is type the string that u will replace 

replace means type the string that you want to replace with 

subject means type the variable which has the string
```

```
<?php
$phrase = "Chan Nyein Wei";

echo substr($phrase, 4);
?>
```

```
will print Nyein Wei
```

### Working with numbers
```
pow for the sqaure pow(2,4)
will print 16

sqrt() for the square root sqrt(144)
will print(12)

max(2 , 10) will tell which number is greater

min(2, 10) will tell which number is smaller

round(3.2) will round to 3
round(3.7) will round to 4

ceil(3.3) will round to 4

floor(3.3) no matters what it will round down to 3.
```

### Getting User input

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>

<form action="site.php" method="get">
	Name: <input type="text" name="Name">
	<br>
	Age: <input type="number" name="age">
	<input type="submit">
	</form>
	<br>
	Your name is <?php echo $_GET["Name"] ?>
	<br>
	Your age is <?php echo $_GET["age"] ?>
</body>
</html>
```

### Basic Calculator

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<form action="site.php" method="get">
		<input type="number" name="num1">
		<br>
		<input type="number" name="num2">
		<input type="submit">
	</form>
	Answer: <?php echo $_GET["num1"] + $_GET["num2"]?>
</body>
</html>
```

### Building Madlibs Game

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<form action="site.php" method="get">
		Color: <input type="text" name="color"> <br>
		Plural Noun: <input type="text" name="pluralNoun"> <br>
		Name: <input type="text" name="name"> <br>
		<input type="submit">
	</form>
	<?php
		$color = $_GET["color"];
		$pluralNoun = $_GET["pluralNoun"];
		$name = $_GET["name"];
		echo "Roses are $color <br>";
		echo "$pluralNoun are blue <br>";
		echo "I love you $name <br>";
	?>
</body>
</html>
```

### Arrays

If you wanna print 1st one u can count as 0 in index.
```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<?php
	$friends = array("John" , "Keith" , "Sniper");
	echo $friends[0];
	?>
</body>
</html>
```

If you wanna count how many names in arrays u can echo it with count($variable);

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<?php
	$friends = array("John" , "Keith" , "Sniper");
	echo count($friends);
	?>
</body>
</html>
```

### Using Checkboxes

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<form action="site.php" method="post">
		Apples: <input type="checkbox" name="fruits[]" value="apples"><br>
		Oranges: <input type="checkbox" name="fruits[]" value="oranges"><br>
		Strawberry: <input type="checkbox" name="fruits[]" value="strawberry"><br>
		<input type="submit">
	</form>

	<?php
	$fruits = $_POST["fruits"];
	echo $fruits[1];

	?>
</body>
</html>
```

### Associate Arrays

Jim = key
A+  = value
```
	<?php
	$grades = array("Jim" => "A+", "Pam" => "B-", "Sam" => "C+");
	echo $grades["Jim"];
	?>
```

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>

	<form action="site.php" method="post">
		Student: <input type="text" name="student">
		<input type="submit">
	</form>
	
	<?php
	$grades = array("Jim" => "A+", "Pam" => "B-", "Sam" => "C+");
	echo $grades[$_POST["student"]];
	?>
</body>
</html>

```

### Functions

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>


	<?php
		function sayHi($name){
			echo "Hello $name";
		}
		sayHi("Chan");
	?>
</body>
</html>
```

### Return Statements

```
<?php

function cube($num) {
	return $num * $num * $num;
}

$cubeResult = cube(4);
echo $cubeResult;
?>
```

### If statements

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>

	<?php

	$isMale = false;
	if ($isMale){
		echo "You are male";		
	} else {
		echo "You are not male";
	}
	?>
</body>
</html>
```

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>

	<?php

	$isMale = true;
	$isTall = true;
	if ($isMale && $isTall){
		echo "You are a tall male";		
	} elseif($isMale && !$isTall) {
		echo "You are a short male";
	} elseif (!$isMale && $isTall ){
		echo "You are not male but u r tall";
	} else {
		echo "You are not male and not tall";
	}
	?>
</body>
</html>
```

### If statement comparison

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>

<?php
function getMax($num1, $num2, $num3){
	if($num1 >= $num2 && $num1 >= $num3){
		return $num1;
	} elseif($num2 >= $num1 && $num2 >= $num3){
		return $num2;
	}else{
		return $num3;
	}
}
	echo getMax(3, 8, 100);
?>
</body>
</html>
```

### Building a better calculator

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<form action="site.php" method="post">
	First Num:<input type="number" step="0.1" name="num1"><br>
	OP: <input type="text" name="op"><br>
	Second Num:<input type="number" name="num2"> <br>
	<input type="submit">
</form>
<?php
$num1 = $_POST["num1"];
$num2 = $_POST["num2"];
$op = $_POST["op"];

if($op == "+"){
	echo $num1 + $num2;
} elseif($op == "-"){
	echo $num1 - $num2;
} elseif($op == "/"){
	echo $num1 / $num2;
} elseif($op == "*"){
	echo $num1 * $num2;
} else {
	echo "Invalid Operator";
}
?>
</body>
</html>
```

### Switch Statement

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<form action="site.php" method="post">
	What was your grade?
	<input type="text" name="grade">
	<input type="submit">
</form>
<?php
$grade = $_POST["grade"];
switch($grade){
	case "A":
		echo "You did great";
		break;
	case "B":
		echo "You did pretty good";
		break;
	case "C":
		echo "You did properly";
		break;
	case "D":
		echo "You did pretty bad";
		break;
	case "F":
		echo "You fail!";
		break;
	default:
		echo "Invalid Grade!";
	}

?>
</body>
</html>
```

### While loops

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
$index = 1;
while($index <= 5){
	echo "$index <br>";
	$index++;
}
?>
</body>
</html>
```

### Do while loop

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
$index = 6;
do{
	echo "$index <br>";
	$index++;
}while($index <= 5);
?>
</body>
</html>
```

### For loop

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
$luckyNumber = array(4, 6, 14, 23, 42);

for($i = 0; $i < count($luckyNumber); $i++){
	echo "$luckyNumber[$i] <br>";
}
?>
</body>
</html>
```

### Classes

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
	class Book{
		var $title;
		var $aurthor;
		var $pages;
	}
	$book1 = new Book; //objects
	$book1->title = "Harry Potter";
	$book1->author = "JK Rowling";
	$book1->pages = 400;

	echo $book1->title;
	echo $book1->author;
	echo $book1->pages;
?>
</body>
</html>
```

### Constructors

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
	class Book{
		var $title;
		var $aurthor;
		var $pages;

		function __construct($aTitle, $aAuthor, $aPages){
			$this->title = $aTitle; //refer to current object
			$this->author = $aAuthor;
			$this->pages = $aPages;
		}
	}
	$book1 = new Book("Harry Potter" , "JK Rowling", 400);
	echo $book1->title;
?>
</body>
</html>
```

### Object Functions

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
	class Student {
		var $name;
		var $major;
		var $gpa;

		function __construct($name, $major, $gpa){
			$this->name = $name;
			$this->major = $major;
			$this->gpa = $gpa;
		}

		function hasHonors(){
			if($this->gpa >= 3.5){
				return "true";
			}
			return "false";
		}
	}
	$student1 = new Student("Jim", "Computer Science", 2.8);
	$student2 = new Student("Emma", "English", 3.6);

	echo $student2->hasHonors();
?>
</body>
</html>
```

### Getters & Setters

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
	class Movie {
		public $title;
		private $rating;

		function __construct($title, $rating){
			$this->title = $title;
			$this->setRating($rating);
		}
		function getRating(){
			return $this->rating;
		}
		function setRating($rating){
			if($rating == "G" || $rating == "PG" || $rating == "PG-13" || $rating == "LOL"){
				$this->rating = $rating;
			}else{
				$this->rating = "NR";
			}
		}
	}
	$avengers = new Movie("Avengers", "PG-13");
	echo $avengers->getRating();
?>
</body>
</html>
```
### Inheritance

```
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
<?php
	class Chef {

		function makeChildren(){
			echo "The chef makes children <br>";
		}
		function makeSalad(){
			echo "The chef makes salad <br>";
		}
		function makeSpecialDish(){
			echo "The chef makes bbq ribs <br>";
		}
	}

	class ItalialChef extends Chef {
		function makePasta(){
			echo "The chef makes pasta <br>";
		}
		function makeSpecialDish(){ //overwriting the function
			echo "The chef makes chicken param <br>";
		}
	}

	$chef = new Chef();
	$chef->makeSpecialDish();

	$chef = new ItalialChef();
	$chef->makeSpecialDish();
?>
</body>
</html>
```
