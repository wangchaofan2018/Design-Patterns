package compesite;

/**
 * Created by wangchaofan on 2020/10/30.
 */
public abstract class FileSystemNode {
    protected String path;
    private boolean dirFlag;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public void setDirFlag(boolean dirFlag){
        this.dirFlag = dirFlag;
    };

    public boolean getDirFlag(){
        return dirFlag;
    };

    public void print() {
        System.out.println(path);
    }
}
