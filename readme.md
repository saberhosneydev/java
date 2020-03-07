# Compile
  - When compiling a single file
  
    `$> javac fileName.java`
  - When mutliple files
    
    run `$> dir */*.java *.java > sources.txt`
    
    then open `sources.txt` and make only one file per line
    
    then run `$> javac @sources.txt -d OutputDir/`
# Run
  - Run a non-package file
  
    `$> java ClassName`
    
  - Run a packaged file
    
    make sure you are one directory before the file
    eg. your file is `/path/to/packageName/file.class` so open terminal in `/path/to/`
    and run :
    
    `$> java packageName.ClassName`
  
  - Run a packaged file
    
    `java -jar fileName.jar`
# Packaging
make sure you created a file called MANIFEST.txt with this content

```
Main-Class: ClassName
 
```
where `Main-Class` is your app entry point.
then run : 

 `$> jar cfm output.jar MANIFEST.txt -C src/ . `