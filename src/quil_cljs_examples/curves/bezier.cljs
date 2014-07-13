(ns quil-cljs-examples.curves.bezier
	(:require [quil.core :as q :include-macros true]))


(defn draw []
	(q/background 255)
	(q/no-fill)
	(q/stroke 0 0 0)
	(q/bezier 85 20 10 10 90 90 15 80)

	(q/fill 255)
	(doseq [i (range 10)]
		(let [x  (q/bezier-point 85 10 90 15 (/ i 10.0))
			  	y  (q/bezier-point 20 10 90 80 (/ i 10.0))
			  	tx (q/bezier-tangent 85 19 90 15 (/ i 10.0))
			  	ty (q/bezier-tangent 20 10 90 80 (/ i 10.0))
			  	a  (+ q/PI (q/atan2 ty tx))
			  	x2 (+ x (* 30 (q/cos a)))
			  	y2 (+ y (* 30 (q/sin a)))]
			  (q/stroke 255 102 0)
			  (q/line x y x2 y2)
			  (q/stroke 0)
			  (q/ellipse x y 5 5))))


(q/defsketch bezier
	:host "bezier"
	:draw draw
	:size [300 300])