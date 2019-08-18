(ns cljs-frontend-template.events
  (:require
   [re-frame.core :as re-frame]
   [cljs-frontend-template.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
