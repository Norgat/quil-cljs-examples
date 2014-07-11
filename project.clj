(defproject quil-cljs-examples "0.1.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
  				      [org.clojars.norgat/quil "2.0.1-SNAPSHOT"]
  				      [org.clojure/clojurescript "0.0-2268"]]

  :plugins [[lein-cljsbuild "1.0.3"]]
  :hooks [leiningen.cljsbuild]
	        
  :cljsbuild
  {:builds [{:source-paths ["src"]
             :jar false
             :compiler
             {:output-to "web/js/main.js"
              :externs ["externs/processing-externs.js"]
              :optimizations :whitespace
              :pretty-print true}}]})
