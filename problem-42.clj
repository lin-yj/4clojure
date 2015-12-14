#(loop [x % pi 1]
  (if (or (= x 0) (= x 1))
    pi
    (recur (dec x) (* pi x))
  )
)
