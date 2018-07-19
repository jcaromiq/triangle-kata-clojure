(ns kata.core_should
  (:require [midje.sweet :refer :all]
            [kata.core :refer :all])
  )

(facts
  "About Type of triangle given the length of the sides"
  (fact
    "Should throw exception given more than three sides"
    (kind-triangle [1 2 3 4]) => (throws IllegalArgumentException))

  (fact
    "Should throw exception given sides as not numerical"
    (kind-triangle ["a" 2 3]) => (throws IllegalArgumentException))

  (fact
    "Should throw exception given sides with size not positive"
    (kind-triangle [0 2 3]) => (throws IllegalArgumentException))

  (fact
    "Should return equilateral if sides are equals"
    (kind-triangle [1 1 1]) => "equilateral")

  (fact
    "Should return isosceles if only two sides are equals"
    (kind-triangle [1 1 2]) => "isosceles")


)