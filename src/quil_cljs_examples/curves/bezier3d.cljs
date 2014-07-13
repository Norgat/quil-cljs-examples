(ns quil-cljs-examples.curves.bezier3d
	(:require [quil.core :as q :include-macros true]))


(defn draw []
	(q/background 255)
	(q/no-fill)
	(q/stroke 0 0 0)

	(doseq [i (range 3)]
		(q/bezier-detail (* (+ 1 i) (+ 1 i)))
		(q/bezier 85 20 0 10 10 0 90 90 0 15 80 0)))


(q/defsketch bezier3d
	:host "bezier3d"
	:draw draw
	:renderer :p3d
	:size [300 300])