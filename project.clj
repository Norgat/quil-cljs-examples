(defproject quil-cljs-examples "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
  				 [quil "2.0.0-cljs-SNAPSHOT"]
  				 [org.clojure/clojurescript "0.0-2202"]]

  :plugins [[lein-cljsbuild "1.0.3"]]
  :hooks [leiningen.cljsbuild]
	        
  :cljsbuild
  {:builds [{:source-paths ["src"]
             :jar false
             :compiler
             {:output-to "web/js/main.js"
              :optimizations :whitespace
              :pretty-print true}}]})
