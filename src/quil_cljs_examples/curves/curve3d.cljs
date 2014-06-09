(ns quil-cljs-examples.curve3d
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch]]))


(defn draw-curves [shift]
	(q/curve 5 (+ shift 28) 5 (+ shift 28) 73 (+ shift 26) 73 (+ shift 63))
	(q/curve 5 (+ shift 28) 73 (+ shift 26) 73 (+ shift 63) 15 (+ shift 67))
	(q/curve 73 (+ shift 26) 73 (+ shift 63) 15 (+ shift 67) 15 (+ shift 67)))


(defn draw []
	(q/background 255)
	(q/no-fill)

	(q/stroke 0)
	(q/curve-detail 1)
	(draw-curves -15)

	(q/stroke 126)
	(q/curve-detail 2)
	(draw-curves 0)

	(q/stroke 255 102 0)
	(q/curve-detail 4)
	(draw-curves 15))


(defsketch curve3d
	:host "curve3d"
	:draw draw
	:renderer :p3d
	:size [300 300])