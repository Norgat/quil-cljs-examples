(ns quil-cljs-examples.graphics.graphics
	(:require [quil.core :as q :include-macros true]))

(def g (atom nil))

(defn setup []
	(reset! g (q/create-graphics 100 100 :p3d)))


(defn draw []
	(q/background 255)
	(q/with-graphics @g
		(q/background 102)
		(q/line 0 0 100 100))
	(q/image @g 10 10))


(q/defsketch graphics
	:host "graphics"
	:draw draw
	:setup setup
	:size [300 300])