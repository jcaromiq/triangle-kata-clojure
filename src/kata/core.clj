(ns kata.core)

(defn validSize?
  [size]
  (and (pos-int? size) (number? size )))

(defn triangle?
  [sides]
  (= (count sides) 3))

(defn foo
  [sizes]
  (count (frequencies sizes)))

(defmulti kind (fn [sides] (foo sides)))
(defmethod kind 1 [sides] "equilateral")
(defmethod kind 2 [sides] "isosceles")

(defn kind-triangle
  [sides]
  (let [s (filter validSize? sides)]
    (if (not (triangle? s)) (throw (IllegalArgumentException.)))
    (kind s)))


