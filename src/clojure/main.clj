(ns main
  (:import (com.cruxteq ITest)))

(defn -main
  [& args]
  (println "Hello world!"))

(gen-class
 :name "com.cruxteq.Test"
 :implements [com.cruxteq.ITest]
 :exposes-methods {testString parentTestString}
 
 :prefix "itest-"
 :init init
 :state state
 :constructors {[] []})

(defn itest-init []
  [[] (ref {})])

(defn itest-a [] "123")
(defn itest-testString [this]
  (.parentTestString this)); No matching field here

(defn test-iface-default
  []
  (let [test (com.cruxteq.Test.)]
    (.testString test)))
