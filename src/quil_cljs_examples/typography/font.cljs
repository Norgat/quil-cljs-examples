(ns quil-cljs-examples.typography.font
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch with-graphics]]))


(defn draw []
	(q/background 255)
	(q/fill 0)

	(let [font (q/create-font "FFScala" 20)]
		(q/text-font font)
		(q/text "The quick bro" 15 50)))


(defsketch typography-font
	:host "typography-font"
	:draw draw
	:size [300 300])