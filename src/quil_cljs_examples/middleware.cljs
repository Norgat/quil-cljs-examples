(ns quil-cljs-examples.middleware
	(:require [quil.core :as q :include-macros true]
			  		[quil.middleware :as m]))

(defn setup []
	{:x 100 :y 100})

(defn draw [state]
	(q/background 255)
	(q/line 0 0 (:x state) (:y state)))

(q/defsketch middleware
	:draw draw
	:setup setup
	:size [300 300]
	:host "middleware"
	:middleware [m/fun-mode])