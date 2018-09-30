# microservices

## A Leiningen mothership project

```
cd mothership
0% lein repl
user=> (require '[mothership.core :as m] :reload)
nil
user=> (m/start)
starting lander:  {"altitude":0}

ArityException Wrong number of args (1) passed to: xml/emit  clojure.lang.AFn.throwArity (AFn.java:429)
user=> ;; Now I go and fix code, and reload when fixed
user=> (require '[mothership.core :as m] :reload-all)
nil
user=> (m/start)
starting lander:  {"altitude":0}
starting thruster:  <?xml version="1.0" encoding="UTF-8"?><fuel type="liquid hydrogen"></fuel>
starting controller
nil
user=>
```

## A Boot script with subproject in pods

```
0% boot repl
starting lander:  {"altitude":0}
starting thruster:  <?xml version="1.0" encoding="UTF-8"?><fuel type="liquid hydrogen"></fuel>
starting controller
boot.user=> (pod/with-eval-in controller (controller.core/get-request-count))
2
;; ^ after hitting 'curl http://localhost:8080' twice
```
