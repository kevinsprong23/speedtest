# run tests
setwd("~/Personal/speedtest/R")
source("src/tests.R")


#-------------------------------------------------------------------------------
# test array loop
elapsedTime <- rep(0, 10)
for (i in 1:10) {
  tSt <- proc.time()
  arrayLoop()
  tEnd <- proc.time() - tSt
  elapsedTime[i] <- tEnd[["elapsed"]]
}
# write results
write(elapsedTime, file="results/arrayLoop.csv", ncolumns=1)


#-------------------------------------------------------------------------------
# test file IO
elapsedTime <- rep(0, 10)
for (i in 1:10) {
  tSt <- proc.time()
  fileIO("../data/longtext.txt")
  tEnd <- proc.time() - tSt
  elapsedTime[i] <- tEnd[["elapsed"]]
}
# write results
write(elapsedTime, file="results/fileIO.csv", ncolumns=1)


#-------------------------------------------------------------------------------
# test csv parsing
elapsedTime <- rep(0, 10)
for (i in 1:10) {
  tSt <- proc.time()
  csvParse("../data/longcsv.csv")
  tEnd <- proc.time() - tSt
  elapsedTime[i] <- tEnd[["elapsed"]]
}
# write results
write(elapsedTime, file="results/csvParse.csv", ncolumns=1)


#-------------------------------------------------------------------------------
# test array multiplication
A <- matrix(rep(2, 1000000), 1000, 1000)
B <- matrix(rep(3, 1000000), 1000, 1000)

# loop and time
elapsedTime <- rep(0, 10)
for (i in 1:10) {
  tSt <- proc.time()
  arrayMultiply(A, B)
  tEnd <- proc.time() - tSt
  elapsedTime[i] <- tEnd[["elapsed"]]
}
# write results
write(elapsedTime, file="results/arrayMultiply.csv", ncolumns=1)


#-------------------------------------------------------------------------------
# test matrix multiplication
elapsedTime <- rep(0, 10)
for (i in 1:10) {
  tSt <- proc.time()
  matrixMultiply(A, B)
  tEnd <- proc.time() - tSt
  elapsedTime[i] <- tEnd[["elapsed"]]
}
# write results
write(elapsedTime, file="results/matrixMultiply.csv", ncolumns=1)


#-------------------------------------------------------------------------------
# test object creation
elapsedTime <- rep(0, 10)
for (i in 1:10) {
  tSt <- proc.time()
  classCreation()
  tEnd <- proc.time() - tSt
  elapsedTime[i] <- tEnd[["elapsed"]]
}
# write results
write(elapsedTime, file="results/classTest.csv", ncolumns=1)


