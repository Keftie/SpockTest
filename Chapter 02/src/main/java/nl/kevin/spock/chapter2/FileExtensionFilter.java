package nl.kevin.spock.chapter2;

import java.util.*;

/**
 * A sample class that takes a list of image
 * names and returns only those that are jpeg files
 * @author kevin
 *
 */
public class FileExtensionFilter {

    private Set<String> validExtensions = new HashSet<>();

    public void addValidExtension(String extension) {
        validExtensions.add(extension);
    }

    public Collection<String> filterFileNames(List<String> input) {
        List<String> result = new ArrayList<>();

        for (String filename : input) {
            int extensionIndex = filename.lastIndexOf(".");
            if (extensionIndex < 0) {
                continue;
            }
            String fileExtension = filename.substring(extensionIndex + 1);
            if (validExtensions.contains(fileExtension)) {
                result.add(filename);
            }
        }

        return result;
    }
}
