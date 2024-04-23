(ns telemere-repro
  (:require
   [clojure.tools.logging :as t.log]
   [taoensso.telemere :as t]))

(defn -main
  [& _]
  (println (t/check-intakes))
  (t.log/info "a message"))
