package compesite;

/**
 * Created by wangchaofan on 2020/10/30.
 */
public class FileNode extends FileSystemNode{

    @Override
    public boolean getDirFlag() {
        return super.getDirFlag();
    }

    public FileNode(String path) {
        super(path);
        super.setDirFlag(false);
    }
    @Override
    public int countNumOfFiles() {
        return 1;
    }
}
