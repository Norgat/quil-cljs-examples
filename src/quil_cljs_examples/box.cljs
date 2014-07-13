(ns quil-cljs-examples.box
	(:require [quil.core :as q :include-macros true]
						[quil.middleware :as m]))


(defn draw []
	(q/background 50)
	(q/translate 180 150 0)
	(q/rotate-y (+ (/ 3.14 3)
				   (* 3.14
				  	 (/ 210.0 300.0))))
	(q/rotate-x (/ -3.14 6))
	(q/box 30))


(q/defsketch example4
	:host "example4"
	:draw draw
	:renderer :opengl
	:middleware [m/fun-mode m/navigation-3d]
	:size [300 300])