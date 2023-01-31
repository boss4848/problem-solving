package main

import (
	"fmt"
	"sort"
)

func main() {

	var values [3]int
	fmt.Scan(&values[0])
	fmt.Scan(&values[1])
	fmt.Scan(&values[2])

	sort.Ints((values[:]))

	fmt.Print(values[1])
}
