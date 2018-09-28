(ns lander.core
  (:require [cheshire.core :as json]))

(defn start []
  (println "starting lander: " (json/generate-string {:altitude 0})))
