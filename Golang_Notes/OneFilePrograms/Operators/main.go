package main

import "fmt"

func main() {
	// Arithmetic operators
	fmt.Println("Arithmetic Operators!")
	a := 10
	b := 5
	fmt.Println("a = ", a , "; b = ", b)
	sum := a + b        // Addition
	fmt.Println("Addition: a + b = ", sum)
	difference := a - b // Subtraction
	fmt.Println("Subtraction: a - b = ", difference)
	product := a * b    // Multiplication
	fmt.Println("Multiplication: a * b = ", product)
	quotient := a / b   // Division
	fmt.Println("Division: a / b = ", quotient)
	remainder := a % b  // Modulo
	fmt.Println("Modulo: a % b = ", remainder)
	a++                 // Increment a by 1 (postfix)
	fmt.Println("Increment: a++ = ", a)
	b--                 // Decrement b by 1 (postfix)
	fmt.Println("Decrement: b-- = ", b)
	// Assignment operators
	a = 10  // Assign 10 to a
	fmt.Println("Assignment: a = 10 -> a = ", a)
	a += 5  // Equivalent to a = a + 5
	fmt.Println("Addition Assignment: a += 5 -> a = ", a)
	b *= 2  // Equivalent to b = b * 2
	fmt.Println("Multiplication Assignment: b *= 2 -> b = ", b)
	a -= 3  // Equivalent to a = a - 3
	fmt.Println("Subtraction Assignment: a -= 3 -> a = ", a)
	b /= 2  // Equivalent to b = b / 2
	fmt.Println("Division Assignment: b /= 2 -> b = ", b)
	a %= 4  // Equivalent to a = a % 4
	fmt.Println("Modulo Assignment: a %= 4 -> a = ", a)
	a &= 3  // Equivalent to a = a & 3 (bitwise AND)
	fmt.Println("Bitwise AND Assignment: a &= 3 -> a = ", a)	
	b |= 1  // Equivalent to b = b | 1 (bitwise OR)
	fmt.Println("Bitwise OR Assignment: b |= 1 -> b = ", b)
	a ^= 2  // Equivalent to a = a ^ 2 (bitwise XOR)
	fmt.Println("Bitwise XOR Assignment: a ^= 2 -> a = ", a)
	a <<= 1 // Equivalent to a = a << 1 (left shift)
	fmt.Println("Left Shift Assignment: a <<= 1 -> a = ", a)
	b >>= 1 // Equivalent to b = b >> 1 (right shift)
	fmt.Println("Right Shift Assignment: b >>= 1 -> b = ", b)
	// Comparison operators
	isEqual := (a == b)          // Check if a is equal to b
	fmt.Println("Check a == b = ", isEqual)
	isNotEqual := (a != b)       // Check if a is not equal to b
	fmt.Println("Check a != b = ", isNotEqual)
	isLess := (a < b)            // Check if a is less than b
	fmt.Println("Check a < b = ", isLess)
	isGreater := (a > b)         // Check if a is greater than b
	fmt.Println("Check a > b = ", isGreater)
	isLessOrEqual := (a <= b)    // Check if a is less than or equal to b
	fmt.Println("Check a <= b = ", isLessOrEqual)
	isGreaterOrEqual := (a >= b) // Check if a is greater than or equal to b
	fmt.Println("Check a >= b = ", isGreaterOrEqual)
	// Logical operators
	isTrue := (a > 0) && (b > 0)       // Logical AND
	fmt.Println("Check a > 0 && b > 0 = ", isTrue)
	isEitherTrue := (a > 0) || (b > 0) // Logical OR
	fmt.Println("Check a > 0 || b > 0 = ", isEitherTrue)
	isNotTrue := !(a > 0)              // Logical NOT
	fmt.Println("Check !(a > 0) = ", isNotTrue)
	// Bitwise operators
	bitwiseAnd := a & b     // Bitwise AND
	fmt.Println("Check a & b = ", bitwiseAnd)
	bitwiseOr := a | b      // Bitwise OR
	fmt.Println("Check a | b = ", bitwiseOr)
	bitwiseXor := a ^ b     // Bitwise XOR
	fmt.Println("Check a ^ b = ", bitwiseXor)
	bitwiseAndNot := a &^ b // Bitwise AND NOT
	fmt.Println("Check a &^ b = ", bitwiseAndNot)
	leftShift := a << 1     // Left shift
	fmt.Println("Check a << 1 = ", leftShift)
	rightShift := a >> 1    // Right shift
	fmt.Println("Check a >> 1 = ", rightShift)

}
