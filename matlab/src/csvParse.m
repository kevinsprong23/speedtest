function csvParse(filePathIn)

parsedFile = importdata(filePathIn, ',');
fifthColumn = parsedFile(:, 5);

end

