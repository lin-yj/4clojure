(fn [x & args]
  (loop [high x left args]
    (if (= () left)
      high
      (recur (if (< high (first left)) (first left) (identity high)) (drop 1 left))
    )
  )
)