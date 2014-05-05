function fileIO(filePathIn)

fid = fopen(filePathIn);
fileContents = textscan(fid, '%s');
fclose(fid);

end

