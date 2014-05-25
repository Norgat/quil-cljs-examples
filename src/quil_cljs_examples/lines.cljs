(ns quil-cljs-examples.lines
	(:require [quil.core :as q])
	(:use-macros [quil.sketch :only [defsketch]]))


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


(defsketch example1
	:draw draw
	:host "example1"
	:size [300 300]
	:mouse-pressed q/no-loop
	:mouse-released q/start-loop)