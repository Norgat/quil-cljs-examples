(ns quil-cljs-examples.image.create
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch with-graphics]]))

(def img (atom nil))
(def new-img (atom nil))

(defn setup []
	(reset! img (q/create-image 50 50 :rgb))
	(q/set-pixel @img 10 10 (q/color 0 90 102))

	(reset! new-img (q/create-image 50 50 :rgb))
	(q/copy @img @new-img [0 0 50 50] [0 0 50 50]))


(defn draw []
	(q/background 255)
	(q/image @img 20 20)
	(q/image @new-img 120 120))


(defsketch create-image
	:host "create-image"
	:draw draw
	:setup setup
	:size [300 300])