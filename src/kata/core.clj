(ns kata.core)

(defn- sizes-are-valid? [sizes]
  (let [max (first (reverse (sort sizes)))
        minsum (apply + (rest (reverse (sort sizes))))]
        (> minsum max)))

(defn- only-three-sides?
  [sides]
  (= (count (filter pos-int? sides)) 3))

(defn- well-formed-triangle?
  [sides]
    (and (only-three-sides? sides) (sizes-are-valid? sides)))


(defn- sizes-equals
  [sizes]
  (apply max (vals (frequencies sizes))))

(defmulti kind (fn [sides] (sizes-equals sides)))

(defmethod kind 3 [_] "equilateral")
(defmethod kind 2 [_] "isosceles")
(defmethod kind :default [_] "scalene")

(defn kind-of-triangle
  [sides]
  (if (well-formed-triangle? sides)
    (kind sides)
    (throw (IllegalArgumentException.))))