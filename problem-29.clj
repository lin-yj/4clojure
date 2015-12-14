#(reduce str (remove (fn [x] (= (str x) (str (clojure.string/lower-case x)))) (vec %)))
