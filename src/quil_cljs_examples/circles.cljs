(ns quil-cljs-examples.circles
	(:require [quil.core :as q])
	(:use-macros [quil.sketch :only [defsketch with-sketch]]))


(def host "example2")

(defn ^:export clean-sketch []
	(with-sketch (q/get-sketch-by-id host)
		(q/background 255)))

(defn draw-circle []
	(q/fill 204 102 0)
	(q/ellipse (q/mouse-x) (q/mouse-y) 12 12))

(defsketch example2
	:host host
	:size [300 300]
	:setup #(q/background 255)
	:mouse-pressed draw-circle)