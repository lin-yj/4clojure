#(loop [x %]
	(if (some sequential? x)
      (recur
       	(concat (take-while (complement sequential?) x)
                (first (drop-while (complement sequential?) x))
				        (drop 1 (drop-while (complement sequential?) x))
        )
      )
  x)
)
