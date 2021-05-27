package fileproperties;
/** 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class FileProperties 
{
    public static String getNameWithoutExtension(String fileName)
    {
        String fileNameNoExtension="";
        int pos=0;
        while(pos<fileName.length()&&fileName.charAt(pos)!='.')
        {
            fileNameNoExtension+=fileName.charAt(pos);
            pos++;
        }
        return fileNameNoExtension;
    }
}
