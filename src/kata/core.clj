(ns kata.core)

(defn validSize?
  [size]
  (and (pos-int? size) (number? size )))

(defn triangle?
  [sides]
  (= (count sides) 3))

(defn sizes-equals
  [sizes]
  (apply max (vals (frequencies sizes))))

(defmulti kind (fn [sides] (sizes-equals sides)))
(defmethod kind 3 [sides] "equilateral")
(defmethod kind 2 [sides] "isosceles")
(defmethod kind 1 [sides] "scalene")

(defn kind-triangle
  [sides]
  (let [s (filter validSize? sides)]
    (if (not (triangle? s)) (throw (IllegalArgumentException.)))
    (kind s)))


