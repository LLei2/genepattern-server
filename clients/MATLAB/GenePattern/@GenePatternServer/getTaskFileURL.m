function url = getTaskFileURL(obj, pipelineName, fileName)
% 
% this method is deprecated, use getModuleFileURL instead
% returns the URL for the file saved with the pipeline
%
%

jUrl = obj.javaInstance.getModuleFileUrl(pipelineName, fileName);

url = char(jUrl.toString());