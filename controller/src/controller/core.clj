(ns controller.core
  (:require [org.httpkit.server :as http]))

(def request-count (atom 0))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "Request count: " (swap! request-count inc))})

(defn start []
  (println "starting controller")
  (http/run-server app {:port 8080}))

(defn get-request-count []
  @request-count)
