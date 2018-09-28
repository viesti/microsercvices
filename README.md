# microsercvices

A Leiningen mothership with small components

```
cd mothership
0% lein repl
nREPL server started on port 51282 on host 127.0.0.1 - nrepl://127.0.0.1:51282
REPL-y 0.3.7, nREPL 0.2.12
Clojure 1.8.0
Java HotSpot(TM) 64-Bit Server VM 1.8.0_171-b11
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

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
