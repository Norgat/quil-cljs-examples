(ns quil-cljs-examples.typography.metrics
	(:require [quil.core :as q :include-macros true]))


(defn draw []
	(q/background 255)
	(q/fill 0)

	(q/text-size 32)
	(q/text "dp" 0 70)
	(q/line 0 (- 70 (q/text-ascent))
		    100 (- 70 (q/text-ascent)))

	(q/text-size 64)
	(q/text "dp" 35 70)
	(q/line 35 (- 70 (q/text-ascent))
		    100 (- 70 (q/text-ascent)))

	(q/text-size 32)
	(q/text "dp" 150 70)
	(q/line 150 (+ 70 (q/text-descent))
		    250 (+ 70 (q/text-descent)))

	(q/text-size 64)
	(q/text "dp" 185 70)
	(q/line 185 (+ 70 (q/text-descent))
		    250 (+ 70 (q/text-descent))))


(q/defsketch typography-metrics
	:host "typography-metrics"
	:draw draw
	:size [300 300])