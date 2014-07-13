(ns quil-cljs-examples.image.blend
	(:require [quil.core :as q :include-macros true]))

(def gr (atom nil))

(defn setup []
	(let [g (q/create-graphics 50 50 :p2d)]
		(q/with-graphics g
		  (q/background 40 200 255 200)
		  (q/fill 255 0 0)
		  (q/ellipse 12 12 20 20)
		  (q/fill 0 255 0)
		  (q/ellipse 38 12 20 20)
		  (q/fill 0 0 255)
		  (q/ellipse 25 38 20 20))
		(reset! gr g)))


(defn draw []
	(q/background 255)
	(q/image @gr 0 0)
	(q/blend 0 0 300 300 20 20 200 200 :add))


(q/defsketch image-blend
	:host "image-blend"
	:draw draw
	:setup setup
	:size [300 300])