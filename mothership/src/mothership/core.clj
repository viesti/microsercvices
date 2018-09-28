(ns mothership.core
  (:require [lander.core :as lander]
            [thruster.core :as thruster]
            [controller.core :as controller]))

(defn start []
  (lander/start)
  (thruster/start)
  (controller/start))
