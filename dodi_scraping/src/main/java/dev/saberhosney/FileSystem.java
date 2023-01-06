package dev.saberhosney;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystem {
    private final Charset encoding = StandardCharsets.UTF_8;
    private final Path path;

    public FileSystem(String fileName) {
        path = Path.of("./" + fileName + ".json");
    }

    void createFile() throws IOException {
        Files.createFile(path);
    }

    String readString() throws IOException {
        return Files.readString(path, encoding);
    }

    void writeString(String data) throws IOException {
        Files.writeString(path, data);
    }

    boolean deleteFile() throws IOException {
        return Files.deleteIfExists(path);
    }

}
