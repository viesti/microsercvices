(ns thruster.core
  (:require [clojure.data.xml :as xml]))

(defn start []
  (println "starting thruster: " (xml/emit-str (xml/element :fuel {:type "liquid hydrogen"}))))
