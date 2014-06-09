(ns quil-cljs-examples.bezier
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch]]))


(defn draw []
	(q/background 255)
	(q/no-fill)
	(q/stroke 0 0 0)
	(q/bezier 85 20 10 10 90 90 15 80))


(defsketch bezier
	:host "bezier"
	:draw draw
	:size [300 300])