(ns quil-cljs-examples.lines
	(:require [quil.core :as q :include-macros true]))


(defn draw []
	(q/background 255)

	(q/stroke 200 60 5)
	(q/stroke-weight 2)
	(q/line 0 150 (- 300 (mod (q/millis) 300)) 
				  (- 300 (mod (q/millis) 300)))

	(q/stroke 60 50 200)
	(q/stroke-weight 3)
	(q/line (mod (q/millis) 300) (mod (q/millis) 300)
		    300 150))

(q/defsketch example1
	:draw draw
	:host "lines"
	:size [300 300]
	:mouse-pressed q/no-loop
	:mouse-released q/start-loop)
