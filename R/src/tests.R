# the tests

arrayLoop <- function() {
  x <- rep(1,10000000)
  x <- x * 2
}

fileIO <- function(filePathIn) {
  ourFile <- read.csv(filePathIn)
}

csvParse <- function(filePathIn) {
  ourFile <- read.csv(filePathIn)
  fifthColumn <- ourFile[ , 5]
}

arrayMultiply <- function(A, B) {
  C = A * B
}

matrixMultiply <- function(A, B) {
  C = A %*% B
}

classCreation <- function() {
  for (i in 1:10000) {
    x <- structure(1, class="foo")
  }
}

