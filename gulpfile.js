const 
  gulp = require('gulp'),
  kotlin = require("node-kotlin");

gulp.task("default", () => {
  return kotlin({
    src: "src/**/*.kt",
    out: "out",
    verbose: true
  });
});
