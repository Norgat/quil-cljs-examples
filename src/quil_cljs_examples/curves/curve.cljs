(ns quil-cljs-examples.curve
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch]]))


(defn draw []
	(q/background 255)
	(q/stroke 255 102 0)
	(q/curve 5 26 5 26 73 23 73 61)
	(q/stroke 0)
	(q/curve 5 26 73 24 73 61 15 65)
	(q/stroke 255 102 0)
	(q/curve 73 24 73 61 15 65 15 65))


(defsketch curve
	:host "curve"
	:draw draw
	:size [300 300])