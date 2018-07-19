(ns kata.core)

(defn validSize?
  [size]
  (and (pos-int? size) (number? size )))

(defn triangle?
  [sides]
  (= (count sides) 3))

(defn king-triangle
  [sides]
  (let [s (filter validSize? sides)]
    (if (not (triangle? s)) (throw (IllegalArgumentException.)))
    ""))
