(require '[boot.pod :as pod])

(defn deps [project]
  (->> project
       slurp
       read-string
       (drop 3)
       (apply hash-map)
       :dependencies))

(defn project-pod [project-path]
  (let [source-paths #{(str project-path "/src")}
        _ (set-env! :source-paths source-paths) ;; Setting :directories might also do it
        env (-> (get-env)
                (assoc :dependencies (deps (str project-path "/project.clj")))
                (assoc :source-paths source-paths))]
    (pod/make-pod env)))

(def lander (project-pod "lander"))
(pod/with-eval-in lander
  (do
    (require 'lander.core)
    (lander.core/start)))

(def thruster (project-pod "thruster"))
(pod/with-eval-in thruster
  (do
    (require 'thruster.core)
    (thruster.core/start)))

(def controller (project-pod "controller"))
(pod/with-eval-in controller
  (do
    (require 'controller.core)
    (controller.core/start)))
