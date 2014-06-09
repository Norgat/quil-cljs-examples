(ns quil-cljs-examples.bezier
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch]]))


(defn draw []
	(q/background 255)
	(q/no-fill)
	(q/stroke 0 0 0)
	(q/bezier 85 20 10 10 90 90 15 80)

	(q/fill 255)
	(doseq [i (range 10)]
		(q/ellipse (q/bezier-point 85 10 90 15 (/ i 10.0))
				   (q/bezier-point 20 10 90 80 (/ i 10.0))
				   5 5)))


(defsketch bezier
	:host "bezier"
	:draw draw
	:size [300 300])