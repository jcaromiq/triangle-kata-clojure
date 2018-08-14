(ns kata.core_should
  (:require [midje.sweet :refer :all]
            [kata.core :refer :all]))

(facts
 "About Type of triangle given the length of the sides"
 (fact
  "Should throw exception given more than three sides"
  (kind-of-triangle [1 2 3 4]) => (throws IllegalArgumentException))

 (fact
  "Should throw exception given sides as not numerical"
  (kind-of-triangle ["a" 2 3]) => (throws IllegalArgumentException))

 (fact
  "Should throw exception given sides with size not positive"
  (kind-of-triangle [0 2 3]) => (throws IllegalArgumentException))


 (fact
  "Should throw exception if the sum of sides is incorrect"
  (kind-of-triangle [1 1 2]) => (throws IllegalArgumentException))


 (fact
  "Should return equilateral if sides are equals"
  (kind-of-triangle [2 2 2]) => "equilateral")

 (fact
  "Should return equilateral if sides are equals"
  (kind-of-triangle [1 2 2]) => "isosceles")


 (fact
  "Should return scalene if sides aren't equals"
  (kind-of-triangle [3 2 4]) => "scalene"))