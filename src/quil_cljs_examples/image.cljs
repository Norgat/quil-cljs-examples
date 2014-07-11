(ns quil-cljs-examples.image
	(:require [quil.core :as q])
	(:use-macros [quil.core :only [defsketch with-sketch]]))

(def img (atom nil))
(def img-link "https://camo.githubusercontent.com/90bc972502b59f7b670dd3c249a7cfc9796f8d23/687474703a2f2f636c6f75642e6769746875622e636f6d2f646f776e6c6f6164732f7175696c2f7175696c2f7175696c2e706e67")

(defn by-id [id]
  (.getElementById js/document (name id)))

(def user-url-input (atom nil))

(defn ^:export reload-image []
	(with-sketch (q/get-sketch-by-id "example3")
		(reset! img 
			(q/request-image (.-value @user-url-input)))))

(defn setup []
	(reset! user-url-input (by-id "ex3_url"))
	(set! (.-value @user-url-input) img-link)
	(reset! img (q/request-image img-link)))

(defn img-loaded? [image]
	(and image
		 (> (.-width image) 0)))

(defn draw []
	(q/background 255)
	(when (img-loaded? @img)
		(q/image @img 10 10 280 280)))

(defsketch example3
	:draw draw
	:setup setup
	:size [300 300]
	:host "example3")