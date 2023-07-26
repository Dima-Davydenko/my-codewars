package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com
 * /kata/597770e98b4b340e5b000071/solutions/java">Extract file name (6kyu)</a>
 * <p>
 * You have to extract a portion of the file name as follows:
 * <p>
 * Assume it will start with date represented as long number
 * Followed by an underscore
 * You'll have then a filename with an extension
 * it will always have an extra extension at the end
 * Inputs:
 * <p>
 * 1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION
 * <p>
 * 1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34
 * <p>
 * 1231231223123131_myFile.tar.gz2
 * Outputs
 * FILE_NAME.EXTENSION
 * <p>
 * This_is_an_otherExample.mpg
 * <p>
 * myFile.tar
 */

public class FileNameExtractor {
    public String extractFileName(String dirtyFileName) {
        return dirtyFileName.substring(dirtyFileName.indexOf("_") + 1,
                dirtyFileName.lastIndexOf("."));
    }
}
