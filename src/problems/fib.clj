(ns problems.fib
  (:gen-class))

(defn fib [n]
  (loop [x 0 y 1 li []]
    (if (= n (count li))
      li
      (recur y (+ x y) (conj li x)))))

