#(loop [done () left (seq %)]
    (if (= () left)
      done
      (if (= (take-last 1 (last done)) (take 1 left))
        (recur (concat (drop-last 1 done) (list (concat (last done) (take 1 left)))) (drop 1 left))
        (recur (concat done (list (take 1 left))) (drop 1 left))
      )
    )
)