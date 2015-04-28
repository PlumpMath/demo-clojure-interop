(ns clojure-lib.core
  (:require [clojure.math.combinatorics :as combi]))

(defn generate-sequence [x]
  (combi/permutations (range x)))

