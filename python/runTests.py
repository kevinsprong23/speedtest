#!/usr/bin/python

import time
from numpy import ones
from src import tests

# create and loop over an array 10 times, log it
tElapsed = [0] * 10
for i in range(0, 10):
    tSt = time.time()
    tests.arrayLoop()
    tElapsed[i] = time.time() - tSt

filePathOut = "results/arrayLoop.csv"
fileOut = open(filePathOut, "w+")
for x in tElapsed:
    fileOut.write(str(x) + "\n")
fileOut.close()


# read in a large text file
tElapsed = [0] * 10
for i in range(0, 10):
    tSt = time.time()
    tests.fileIO("../data/longtext.txt")
    tElapsed[i] = time.time() - tSt

filePathOut = "results/fileIO.csv"
fileOut = open(filePathOut, "w+")
for x in tElapsed:
    fileOut.write(str(x) + "\n")
fileOut.close()


# read in a large csv and grab a column
tElapsed = [0] * 10
for i in range(0, 10):
    tSt = time.time()
    tests.csvParse("../data/longcsv.csv")
    tElapsed[i] = time.time() - tSt

filePathOut = "results/csvParse.csv"
fileOut = open(filePathOut, "w+")
for x in tElapsed:
    fileOut.write(str(x) + "\n")
fileOut.close()


# numpy array multiplication
A = 2 * ones((1000, 1000))
B = 3 * ones((1000, 1000))

tElapsed = [0] * 10
for i in range(0, 10):
    tSt = time.time()
    tests.arrayMultiply(A, B)
    tElapsed[i] = time.time() - tSt

filePathOut = "results/arrayMultiply.csv"
fileOut = open(filePathOut, "w+")
for x in tElapsed:
    fileOut.write(str(x) + "\n")
fileOut.close()


# numpy matrix multiplication
tElapsed = [0] * 10
for i in range(0, 10):
    tSt = time.time()
    tests.matrixMultiply(A, B)
    tElapsed[i] = time.time() - tSt

filePathOut = "results/matrixMultiply.csv"
fileOut = open(filePathOut, "w+")
for x in tElapsed:
    fileOut.write(str(x) + "\n")
fileOut.close()



