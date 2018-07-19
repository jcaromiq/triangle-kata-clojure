(ns kata.core)

(defn validSize?
  [size]
  (and (pos-int? size) (number? size )))

(defn king-triangle
  [sides]
  (let [s (filter validSize? sides)]
    (if (not (= (count s) 3)) (throw (IllegalArgumentException.)))
    ""))
