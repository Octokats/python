import os
file_name = os.path.basename('/root/file.ext')
print(os.path.splitext(file_name)[0])