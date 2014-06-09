(ns quil-cljs-examples.graphics
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch with-graphics]]))


(defn draw []
	(q/background 255)
	(let [g (q/create-graphics 100 100 :p2d)]
		(with-graphics g
			(q/background 102))
		(q/image g 10 10)))


(defsketch graphics
	:host "graphics"
	:draw draw
	:size [300 300])