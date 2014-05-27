(ns quil-cljs-examples.box
	(:require [quil.core :as q])
	(:use-macros [quil.sketch :only [defsketch]]
				 [quil.helpers.tools :only [with-shape]]))


(defn draw []
	(q/background 50)
	(q/translate 180 150 0)
	(q/rotate-y (+ (/ 3.14 3)
				   (* 3.14
				  	 (/ 210.0 300.0))))
	(q/rotate-x (/ -3.14 6))
	(q/box 30))


(defsketch example4
	:host "example4"
	:draw draw
	:renderer :opengl
	:size [300 300])