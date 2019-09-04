(ns main
  (:import (com.cruxteq AbstractTest)))

(defn -main
  [& args]
  (println "Hello world!"))

(gen-class
 :name "com.cruxteq.Test"
 :extends com.cruxteq.AbstractTest
 :exposes-methods {testString parentTestString}
 
 :prefix "itest-"
 :init init
 :state state
 :constructors {[] []})

(defn itest-init []
  [[] (ref {})])

(defn itest-a [this] "123")

(defn test-iface-default
  []
  (let [test (com.cruxteq.Test.)]
    (.testString test)))
