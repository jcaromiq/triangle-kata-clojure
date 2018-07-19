(ns kata.core_should
    (:require [midje.sweet :refer :all]
      [kata.core :refer :all]))

(facts
  "About Type of triangle given the length of the sides"
  (fact
    "Should throw exception given more than three sides"
    (king-triangle [1 2 3 4])  => (throws Exception)

  )
  
)