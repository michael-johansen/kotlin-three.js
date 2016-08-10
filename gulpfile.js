const
  gulp = require('gulp'),
  kotlin = require("node-kotlin"),
  rimraf = require("rimraf");

gulp.task("default", ["clean"], () => {
  return kotlin({
    src: "src/**/*.kt",
    out: "out",
    moduleName: "kotlin-three",
    verbose: true
  });
});

gulp.task("clean", cb => rimraf("out", {}, cb));
