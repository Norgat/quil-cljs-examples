(ns quil-cljs-examples.typography.attributes
	(:require [quil.core :as q :include-macros true]))

(def lines "LIN1\nLIN2\nLIN3")

(defn text-align []
	(q/text-align :right)
	(q/text "word" 30 30)

	(q/text-mode :screen)
	(q/text-align :center)
	(q/text "word" 30 50)

	(q/text-size 14)
	(q/text-align :left)
	(q/text "word" 30 70)
	(q/text-size 10))

(defn text-leading []
	(q/text-leading 10)
	(q/text lines 60 30)

	(q/text-leading 20)
	(q/text lines 90 30)

	(q/text-leading 30)
	(q/text lines 120 30))

(defn draw []
	(q/background 255)
	(q/fill 0)
	(q/text-leading 10)
	(q/text-mode :model)

	(text-align)
	(text-leading))


(q/defsketch typography-attributes
	:host "typography-attributes"
	:draw draw
	:size [300 300])