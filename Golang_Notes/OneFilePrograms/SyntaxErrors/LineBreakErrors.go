package main

import "fmt"

func main() {
	fmt.Println("Hello, World!") // This is a valid line of code
	fmt.Println("This line is missing a closing parenthesis" // Syntax error: missing closing parenthesis
	fmt.Println("This line is missing a closing quote) // Syntax error: missing closing quote
	fmt.Println("This line is missing a closing parenthesis and quote" // Syntax error: missing both closing parenthesis and quote

	//) // comment to check if this line causes a syntax error due to the misplaced closing parenthesis
	result := add(5, 3) + add(2, 4) // This is valid

	// This is also valid with parentheses
            result := add(5, 3) +
                        add(2, 4)

	result := (add(5, 3) +            // This is also valid with parentheses ()
				add(2, 4))

	result := add(5, 3) +            // This is invalid and will cause a syntax error
	add(2, 4)
}

        func StatRandomNumbers(n int) (int, int)
            { // syntax error
                var a, b int
                for i := 0; i < n; i++
                { // syntax error
                    if rand.Intn(MaxRnd) < MaxRnd/2
                    { // syntax error
                        a = a + 1
                    } else {
                        b++
                    }
                }
                return a, b
            }