package main

import "testing"

func TestAdd(t *testing.T) {
	sum := Add(2, 3)
	if sum != 5 {
		t.Errorf("expected 5, got %d", sum)
	}
}
