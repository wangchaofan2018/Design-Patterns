package compesite;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/10/30.
 */
public class DirectoryNode extends FileSystemNode {
    private List<FileSystemNode> nodes = new LinkedList<>();
    public DirectoryNode(String path) {
        super(path);
        super.setDirFlag(true);
    }

    @Override
    public int countNumOfFiles() {
        int size = 0;
        for (FileSystemNode node : nodes) {
            size += node.countNumOfFiles();
        }
        return size;
    }

    @Override
    public boolean getDirFlag() {
        return super.getDirFlag();
    }

    public void add(File file) {
        if (file.isFile()) {
            FileNode node = new FileNode(file.getPath());
            nodes.add(node);
        } else {
            DirectoryNode directoryNode = new DirectoryNode(file.getPath());
            for (File item : file.listFiles()) {
                directoryNode.add(item);
            }
            nodes.add(directoryNode);
        }
    }

    @Override
    public void print() {
        super.print();
        for (FileSystemNode node : nodes) {
            node.print();
        }
    }
}
