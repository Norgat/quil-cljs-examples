(ns quil-cljs-examples.curve
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch]]))


(defn draw []
	(q/background 255)
	(q/no-fill)
	(q/stroke 0)
	
	(q/curve-tightness 3.5)
	(q/curve 5 26 73 24 73 61 15 65)

	(q/curve-tightness 0.0)
	(q/curve 5 26 73 24 73 61 15 65)
	(doseq [i (range 6)]
		(let [t (/ i 6.0)
			  x  (q/curve-point 5 73 73 15 t)
			  y  (q/curve-point 26 24 61 65 t)
			  tx (q/curve-tangent 5 73 73 15 t)
			  ty (q/curve-tangent 26 24 61 65 t)
			  a  (- (q/atan2 ty tx) q/HALF_PI)
			  x2 (+ x (* 8 (q/cos a)))
			  y2 (+ y (* 8 (q/sin a)))]
			  (q/line x y x2 y2))))


(defsketch curve
	:host "curve"
	:draw draw
	:size [300 300])