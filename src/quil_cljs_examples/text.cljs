(ns quil-cljs-examples.text
	(:require [quil.core :as q :include-macros true]))

(defn draw []
	(q/background 255)
	(q/fill 0)

	(q/text (str (q/day) "." (q/month) "." (q/year) " " (q/hour) ":" (q/minute) ":" (q/seconds))
		25 25))


(q/defsketch text-example
	:draw draw
	:host "example5"
	:size [300 300])