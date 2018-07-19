(ns kata.core_should
  (:require [midje.sweet :refer :all]
            [kata.core :refer :all])
  )

(facts
  "About Type of triangle given the length of the sides"
  (fact
    "Should throw exception given more than three sides"
    (king-triangle [1 2 3 4]) => (throws IllegalArgumentException))

  (fact
    "Should throw exception given sides as not numerical"
    (king-triangle ["a" 2 3]) => (throws IllegalArgumentException))

  (fact
    "Should throw exception given sides with size not positive"
    (king-triangle [0 2 3]) => (throws IllegalArgumentException))


  
)