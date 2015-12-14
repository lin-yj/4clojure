#(if (= % 1)
    '(1) ; check base case
    (loop [order 2 result '(1, 1)]
	(if (= order %) ; exit condition
	    result
	    (recur (inc order) (concat result (list (reduce + (take 2 (reverse
	    result))))))
	)
    )
)
