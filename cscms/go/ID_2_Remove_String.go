package main

import (
	"fmt"
	"strings"
)

func main() {
	var str_1, str_2 string
	fmt.Scan(&str_1)
	fmt.Scan(&str_2)
	var str_1_length = len([]rune(str_1))
	var str_2_length = len([]rune(str_2))

	if str_1_length > str_2_length {
		fmt.Print(strings.ReplaceAll(str_1, str_2, ""))
	} else {
		fmt.Print(strings.ReplaceAll(str_2, str_1, ""))
	}
}
