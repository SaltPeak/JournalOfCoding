package saltpeak.brainstorm;
import net.jimmc.jshortcut.JShellLink;
/**
 * @author BigHit from SaltPeak
 * @category The "saltpeak.brainstorm" Package of "Journal Of Coding" Project
 * @github SaltPeak
 * @domain Generate a Desktop Shortcut for a Certain File Or Directory Not in a Manual Way.
 * @created 2020/4/13 21:33
 */
public class DesktopShortcut {
    private JShellLink link;
    private String shortcutDir;

    public DesktopShortcut() {
        link = new JShellLink();
        shortcutDir = JShellLink.getDirectory("desktop");
    }

    public void generateShortcut(String targetFilePath, String shortcutName, String shortcutIcon){
        link.setPath(targetFilePath.replace("/", "\\"));
        link.setFolder(shortcutDir);
        link.setName(shortcutName);
        link.setIconLocation(shortcutIcon.replace("/","\\"));
        link.save();
    }

    public void setShortcutDir(String shortcutDir){
        this.shortcutDir = shortcutDir.replace("/", "\\");
    }

    public String getTargetFilePath(){
        return link.getPath();
    }

    public String getShortcutDir(){
        return link.getFolder();
    }

    public String getShortcutName(){
        return link.getName();
    }

    public static void main(String[] args) {
        DesktopShortcut shortcut = new DesktopShortcut();
        shortcut.generateShortcut("F:\\Wizard Valley","Wizard Valley", "C:\\Users\\pc\\Downloads\\app.ico");//对中文目录名称不支持
        shortcut.setShortcutDir("F:\\");//对快捷方式输出目录再定向
        //shortcut.generateShortcut("F:\\Wizard Valley","Wizard Valley", "C:\\Users\\pc\\Downloads\\app.ico");
        System.out.println(shortcut.getTargetFilePath());
    }
}