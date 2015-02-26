(ns exercises.ch1)

(def add-squares
  (fn [& numbers]
    (apply
      + (map (fn [n] (* n n)) numbers))))
