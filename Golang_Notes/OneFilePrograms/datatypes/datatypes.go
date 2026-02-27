package main

import "fmt"

func main() {

	//var is used for variable declaration. It can be used to declare variables with or without an initial value. If no initial value is provided, the variable is assigned a default zero value based on its type.

	//Boolean
	var b1 bool = true 			// typed declaration with initial value
	var b2 = true 				// untyped declaration with initial value, the type is inferred as bool
	var b3 bool 				// typed declaration without initial value, defaults to false	
	b4 := true					// short variable declaration, the type is inferred as bool


	// types of integer
	var a int = 2147483647		// int is a general integer type, the size depends on the platform (32 or 64 bits)
	var b int8 = 127		// int8 is an 8-bit integer
	var c int16 = -32767		// int16 is a 16-bit integer
	var d int32 = 2147483647		// int32 is a 32-bit integer
	var e int64 = 9223372036854775807		// int64 is a 64-bit integer
	var f uint = 4294967295		// uint is an unsigned integer type, the size depends on the platform (32 or 64 bits)
	var g uint8 = 255		// uint8 is an 8-bit unsigned integer
	var h uint16 = 65535		// uint16 is a 16-bit unsigned integer
	var i uint32 = 4294967295		// uint32 is a 32-bit unsigned integer
	var j uint64 = 18446744073709551615		// uint64 is a 64-bit unsigned integer

	var k byte = 255		// byte is an alias for uint8, used to represent a byte of data
	var l rune = 'A'		// rune is an alias for int32, used to represent a Unicode code point
	var m float64 = 3.14		// float64 is a 64-bit floating point number
	var n string = "Hello, Go!"	// string is a sequence of characters
	var o bool = true			// bool is a boolean type

	fmt.Println("Boolean values:", b1, b2)
	fmt.Println("Integer values:", a, b, c, d, e, f, g, h, i, j)
	fmt.Println("Byte value:", k)
	fmt.Println("Rune value:", l)
	fmt.Println("Float value:", m)
	fmt.Println("String value:", n)
	fmt.Println("Boolean value:", o)
}