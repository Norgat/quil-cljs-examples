(ns quil-cljs-examples.graphics
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch with-graphics]]))

(def g (atom nil))

(defn setup []
	(reset! g (q/create-graphics 100 100 :p3d)))


(defn draw []
	(q/background 255)
	(with-graphics @g
		(q/background 102)
		(q/line 0 0 100 100))
	(q/image @g 10 10))


(defsketch graphics
	:host "graphics"
	:draw draw
	:setup setup
	:size [300 300])