function csvParse(filePathIn)

fid = fopen(filePathIn);
line = 'z';
while ischar(line)
    line = fgetl(fid);
    parsedLine = textscan(line, '%s', 'Delimiter', ','); % unknown schema
    parsedLine = parsedLine{1}; % cell -> array
    fifthNumber = str2double(parsedLine{5}); % index into array
end
fclose(fid);

end

