(ns quil-cljs-examples.middleware
	(:require [quil.core :as q]
			  		[quil.middleware :as m])
	(:use-macros [quil.sketch :only [with-sketch]]
				 [quil.core :only [defsketch]]))

(defn setup []
	{:x 100 :y 100})

(defn draw [state]
	(q/background 255)
	(q/line 0 0 (:x state) (:y state)))

(defsketch middleware
	:draw draw
	:setup setup
	:size [300 300]
	:host "middleware"
	:middleware [m/fun-mode])