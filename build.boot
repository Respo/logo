
(deftask rsync []
  (with-pre-wrap fileset
    (sh "rsync" "-r" "assets/" "respo.site:repo/Respo/logo/" "--exclude" "main.out" "--delete")
    fileset))

