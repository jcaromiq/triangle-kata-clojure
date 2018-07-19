(ns kata.core)

(defn valid-size?
  [size]
  (and (pos-int? size) (number? size )))

(defn triangle?
  [sides]
  (= (count (filter valid-size? sides)) 3))

(defn sizes-equals
  [sizes]
  (apply max (vals (frequencies sizes))))

(defmulti kind (fn [sides] (sizes-equals sides)))
(defmethod kind 3 [sides] "equilateral")
(defmethod kind 2 [sides] "isosceles")
(defmethod kind :default [sides] "scalene")

(defn kind-of-triangle
  [sides]
  (if (triangle? sides)
    (kind sides)
    (throw (IllegalArgumentException.))))