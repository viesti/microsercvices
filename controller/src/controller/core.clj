(ns controller.core
  (:require [org.httpkit.server :as http]))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})

(defn start []
  (println "starting controller")
  (http/run-server app {:port 8080}))
