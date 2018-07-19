(ns kata.core)

(defn king-triangle
  [sides]
  (let [s (filter number? sides)]
    (if (not (= (count s) 3)) (throw (IllegalArgumentException.)))
    ""))
