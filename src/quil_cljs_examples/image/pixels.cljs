(ns quil-cljs-examples.image.pixels
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch with-graphics]]))

(def a (atom nil))
(def b (atom nil))
(def c (atom nil))
(def d (atom nil))


(defn draw []
	(q/background 255)
	(let [gr (q/create-graphics 100 100 :p2d)]
		(with-graphics gr
			(q/background 0 90 102)
			(q/ellipse 20 12 30 30))
		(q/image gr 10 10)

		(let [px (q/pixels gr)
			  	arr (.toArray px)]
			(when (nil? @a)
				(reset! a arr)
				(reset! b px)
				(reset! c (q/color 0 90 102)))
			(dotimes [i 1000]
				(aset arr i (aget arr (+ i 2))))
			(.set px arr))
		(q/update-pixels gr)
		(q/image gr 150 150)))


(defsketch image-pixels
	:host "image-pixels"
	:draw draw
	:size [300 300])