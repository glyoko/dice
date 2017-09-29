(ns dice.core
  (:gen-class))

(require 'dice.dice)
(refer 'dice.dice)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (dice-prob-memo 100 350)))
