(ns dice.dice
  (:gen-class))

(declare dice-prob)


(defn sum-prev-probs
	[die-count number]
	(+
		(dice-prob die-count (- number 1))
		(dice-prob die-count (- number 2))
		(dice-prob die-count (- number 3))
		(dice-prob die-count (- number 4))
		(dice-prob die-count (- number 5))
		(dice-prob die-count (- number 6))))

(defn dice-prob
	[die-count, number]
	(if (= die-count 1)
		(if (contains? #{1 2 3 4 5 6} number)
			1/6
			0)
		(* 1/6 (sum-prev-probs (- die-count 1) number))))
