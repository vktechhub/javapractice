package main

import "fmt"

var x = 10 // Outer variable

func main() {
	fmt.Println("Outer x:", x) // Output: Outer x: 10
								// scope of x is the entire main function

	x := 20                    // Inner variable shadows the outer variable
								// scope of this x is from this line to the end of the main function
	fmt.Println("Inner x:", x) // Output: Inner x: 20

	{
		x := 30                        // Another inner variable shadows the previous inner variable
										// scope of this x is from this line to the end of this block
		fmt.Println("Innermost x:", x) // Output: Innermost x: 30
	}

	fmt.Println("Inner x after block:", x) // Output: Inner x after block: 20
}
