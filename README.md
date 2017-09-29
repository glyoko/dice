# dice

A poc for using clojure for dynamic algorithms. This test uses a recursive algorithm to calculate the probability of throwing `m` die and getting `n`. e.g. if m=2 and n=6, the program should output 5/36, because that is the probability of throwing a 6 with 2 die.

## Installation

Install Leiningen, then `cd` to the project and `lein run`.

## Usage

The `master` branch does not save the results to recursive calls anywhere, and the `improvement/memoize-function-calls` branch does.

Change the values being passed to the `dice-prob` method in core.clj on the master branch, or switch to the `improvement/memoize-function-calls` branch and change the values passed to the `dice-prob-memo` method there. On each branch, try calling `time lein run` and see how the results differ.
