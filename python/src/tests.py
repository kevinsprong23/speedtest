class blankClass():
    def __init__(self):
        pass

def arrayLoop():
    # create a large array
    x = [1] * 10000000; # a list times an integer N = repeat N times
    # multiply each element by 2
    x = [2 * num for num in x];


def fileIO(filePathIn):
    # read in a large text file
    fileIn = open(filePathIn, 'r')
    for line in fileIn:
        thisLine = line
    fileIn.close()


def csvParse(filePathIn):
    # read in a large text file
    fileIn = open(filePathIn, 'r')
    for line in fileIn:
        fifthNumber = float(line.strip().split(",")[4])
    fileIn.close()


def arrayMultiply(A, B):
    # A, B are numpy 2-D arrays
    C = A * B


def matrixMultiply(A, B):
    from numpy import dot
    # A, B are numpy 2-D arrays
    C = dot(A, B)

def classTest():
    for i in range(10000):
        bc = blankClass();
