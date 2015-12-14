#(loop [done () left (seq %)]
   (if (= () left)
     done
     (if (= (take-last 1 done) (take 1 left))
       (recur (identity done) (drop 1 left))
       (recur (concat done (take 1 left)) (drop 1 left))
     )
   )
)
