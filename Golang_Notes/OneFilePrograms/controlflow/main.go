package main

import "fmt"

func main() {
	// If statement
	x := 4
	if x < 5 {
		fmt.Println("x is less than 5")
		x++ // Increment x by 1
	} else if x == 5 {
		fmt.Println("x is equal to 5")
	} else {
		fmt.Println("x is greater than 5")
		x++ // Increment x by 1
	}

	fmt.Printf("Current value of x: %d\n", x)

	// Switch statement
	day := "Monday"
	switch day {
	case "Monday":
		fmt.Println("It's the start of the week!")
	case "Friday":
		fmt.Println("It's almost the weekend!")
	default:
		fmt.Println("It's a regular day.")
	}

	// For loop
	for i := 0; i < 7; i++ {

		if i == 2 {
			fmt.Println("Continuing to the next iteration at iteration 2")
			continue
		}
		fmt.Println("Iteration:", i)
		if i == 4 {
			fmt.Println("Breaking out of the loop at iteration 4")
			break
		}
	}

	// for loop as a while loop
	j := 0
	for j < 5 {
				if j == 3 {
			goto skip // Jump to the label skip when j is 3
		}
		fmt.Println("While loop iteration:", j)
		j++
	}
skip:
	fmt.Println("Exited the loop.")
	
	// for loop with range
	numbers := []int{1, 2, 3, 4, 5}
	for index, value := range numbers {
		fmt.Printf("Index: %d, Value: %d\n", index, value)
	}
}
