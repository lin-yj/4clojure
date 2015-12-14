(fn [x,y]
  (for [z (reverse (range 1 (+ 1 y)))]
    (filter (fn [w] (zero? (mod (+ z (.indexOf x w)) y))) x)
  )
)
