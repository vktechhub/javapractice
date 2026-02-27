package main

import (
	"fmt"
	"reflect"
)

func main() {

	//var is used for variable declaration. It can be used to declare variables with or without an initial value. If no initial value is provided, the variable is assigned a default zero value based on its type.

	//Boolean
	var b1 bool = true 			// typed declaration with initial value
	var b2 = true 				// untyped declaration with initial value, the type is inferred as bool
	var b3 bool 				// typed declaration without initial value, defaults to false	
	b3 = true					// assigning a value to b3 after declaration
	b4 := true					// short variable declaration, the type is inferred as bool
	b4 = false					// reassigning a value to b4
	var b5 bool					// typed declaration with initial value

	// // types of integer
	var a int = 2147483647		// int is a general integer type, the size depends on the platform (32 or 64 bits)
	var b int8 = 127		// int8 is an 8-bit integer
	var c int16 = -32767		// int16 is a 16-bit integer
	var d int32 = 2147483647		// int32 is a 32-bit integer
	var e int64 = 9223372036854775807		// int64 is a 64-bit integer
	var d1 = 2147483647		// untyped integer, the type is inferred as int
	d2 := 217 	// short variable declaration, the type is inferred as int	
	var f uint = 4294967295		// uint is an unsigned integer type, the size depends on the platform (32 or 64 bits)
	var g uint8 = 255		// uint8 is an 8-bit unsigned integer
	var h uint16 = 65535		// uint16 is a 16-bit unsigned integer
	var i uint32 = 4294967295		// uint32 is a 32-bit unsigned integer
	var j uint64 = 18446744073709551615		// uint64 is a 64-bit unsigned integer

	var k byte = 255		// byte is an alias for uint8, used to represent a byte of data
	var l rune = 'A'		// rune is an alias for int32, used to represent a Unicode code point
	var m1 float32 = 3.14		// float32 is a 32-bit floating point number
	var m float64 = 3.14		// float64 is a 64-bit floating point number
	var m2 = 3.14		// untyped floating point number, the type is inferred as float64
	var n string = "Hello, Go!"	// string is a sequence of characters
	var o bool = true			// bool is a boolean type


	fmt.Println("b1 bool type:", reflect.TypeOf(b1), "b1 value:", b1)
	fmt.Println("b2 untyped type:", reflect.TypeOf(b2), "b2 value:", b2)
	fmt.Println("b3 bool type:", reflect.TypeOf(b3), "b3 value:", b3)
	fmt.Println("b4 bool type:", reflect.TypeOf(b4), "b4 value:", b4)
	fmt.Println("b5 bool type:", reflect.TypeOf(b5), "b5 value:", b5)
	fmt.Println("a int type:", reflect.TypeOf(a), "a value:", a)
	fmt.Println("b int8 type:", reflect.TypeOf(b), "b value:", b)
	fmt.Println("c int16 type:", reflect.TypeOf(c), "c value:", c)
	fmt.Println("d int32 type:", reflect.TypeOf(d), "d value:", d)
	fmt.Println("e int64 type:", reflect.TypeOf(e), "e value:", e)
	fmt.Println("d1 untyped type:", reflect.TypeOf(d1), "d1 value:", d1)
	fmt.Println("d2 untyped type:", reflect.TypeOf(d2), "d2 value:", d2)
	fmt.Println("f uint type:", reflect.TypeOf(f), "f value:", f)
	fmt.Println("g uint8 type:", reflect.TypeOf(g), "g value:", g)
	fmt.Println("h uint16 type:", reflect.TypeOf(h), "h value:", h)
	fmt.Println("i uint32 type:", reflect.TypeOf(i), "i value:", i)
	fmt.Println("j uint64 type:", reflect.TypeOf(j), "j value:", j)
	fmt.Println("k byte type:", reflect.TypeOf(k), "k value:", k)
	fmt.Println("l rune type:", reflect.TypeOf(l), "l value:", l)
	fmt.Println("m1 float32 type:", reflect.TypeOf(m1), "m1 value:", m1)
	fmt.Println("m float64 type:", reflect.TypeOf(m), "m value:", m)
	fmt.Println("m2 untyped type:", reflect.TypeOf(m2), "m2 value:", m2)
	fmt.Println("n string type:", reflect.TypeOf(n), "n value:", n)
	fmt.Println("o bool type:", reflect.TypeOf(o), "o value:", o)	
}