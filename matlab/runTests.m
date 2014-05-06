clear all
close all
clc


%% create and loop over an array, repeat 10 times, log it

timeElapsed = zeros(10,1);
for i = 1:10
    tSt = tic;
    arrayLoop;
    timeElapsed(i) = toc(tSt);
end

results = [];
results.arrayTime = timeElapsed;
structToCsv(results, 'results/arrayLoop.csv')


%% read in a file 10 times, log the time taken

timeElapsed = zeros(10,1);
for i = 1:10
    tSt = tic;
    fileIO('../data/longtext.txt');
    timeElapsed(i) = toc(tSt);
end

results = [];
results.fileIO = timeElapsed;
structToCsv(results, 'results/fileIO.csv')


%% read a file line by line as if needing to parse an unknown format

timeElapsed = zeros(10,1);
for i = 1:10
    tSt = tic;
    csvParse('../data/longcsv.csv');
    timeElapsed(i) = toc(tSt);
end

results = [];
results.fileIO = timeElapsed;
structToCsv(results, 'results/csvParse.csv')


%% matrix multiply a large matrix

% spot them the object creation
A = 2*ones(1000,1000);
B = 3*ones(1000,1000);

timeElapsed = zeros(10,1);
for i = 1:10
    tSt = tic;
    matrixMultiply(A, B);
    timeElapsed(i) = toc(tSt);
end

results = [];
results.matrixMultiply = timeElapsed;
structToCsv(results, 'results/matrixMultiply.csv')


%% elementwise multiply a large matrix

% spot them the object creation
A = 2*ones(1000,1000);
B = 3*ones(1000,1000);

timeElapsed = zeros(10,1);
for i = 1:10
    tSt = tic;
    arrayMultiply(A, B);
    timeElapsed(i) = toc(tSt);
end

results = [];
results.arrayMultiply = timeElapsed;
structToCsv(results, 'results/arrayMultiply.csv')

