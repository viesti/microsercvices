(defn deps [project]
  (->> project
       slurp
       read-string
       (drop 3)
       (apply hash-map)
       :dependencies))

(defn make-combined-deps []
  (distinct (concat (deps "../lander/project.clj")
                    (deps "../thruster/project.clj")
                    (deps "../controller/project.clj"))))

(defproject mothership "0.1.0-SNAPSHOT"
  :dependencies ~(make-combined-deps)
  :source-paths ["src"
                 "../lander/src"
                 "../thruster/src"
                 "../controller/src"])
