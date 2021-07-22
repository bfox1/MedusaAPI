package io.github.bfox1.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;

public interface IYamlLoader
{

    <T> T loadYamlFile(String path, String fileName, Class<T> type );

    <T> T loadYamlFileFromStream(BufferedReader reader, Class<T> clazz);
    /**
     * Files may/can be uploaded directly to Discord using a Command. If this is performed. The File
     * can pass through here to be evaluated. Only files allowed through are currently .yaml files.
     * @param path The location of the File
     * @param fileName The File downloaded.
     */
    void saveToYamlFile(String path, String fileName, Object obj);
}
