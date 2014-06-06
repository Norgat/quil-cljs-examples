(ns quil-cljs-examples.text
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch]]))

(defn draw []
	(q/background 255)
	(q/fill 0)
	(q/text "hello world" 25 25))


(defsketch text-example
	:draw draw
	:host "example5"
	:size [300 300])