(ns kata.core)

(defn triangle?
  [sides]
  (= (count (filter pos-int? sides)) 3))

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