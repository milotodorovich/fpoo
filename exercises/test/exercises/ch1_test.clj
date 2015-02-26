(ns exercises.ch1-test
  (:use midje.sweet)
  (:use [exercises.ch1]))

(println "In the ch1 test file!!!")

(facts "add-squares"
  (fact "[] makes 0"
    (add-squares ) => 0
    (add-squares 1) => 1
    (add-squares 1 2) => 5))
