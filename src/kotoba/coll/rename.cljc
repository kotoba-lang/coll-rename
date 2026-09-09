(ns kotoba.coll.rename
  "rename -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds rename and names, in its
  deps.edn, exactly the definitions rename reaches. Nothing else."
  (:require [kotoba.coll.rename-keys :refer [rename-keys]]))

(defn rename
  "Return a relation (set of maps) built from `xrel` by applying
  `rename-keys` with `kmap` to every map in it. Mirrors clojure.set/rename."
  [xrel kmap]
  (set (map #(rename-keys % kmap) xrel)))
