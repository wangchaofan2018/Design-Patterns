package compesite;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/10/30.
 */
public class Main {
    public static void main(String[] args) {
        String path = "/Users/wangchaofan/github/Design-Patterns";
        File root = new File(path);
        List<FileSystemNode> nodes = new LinkedList<>();
        for (File f : root.listFiles()) {
            if (f.isFile()) {
                FileNode fileNode = new FileNode(f.getPath());
                nodes.add(fileNode);
            } else {
                DirectoryNode directoryNode = new DirectoryNode(f.getPath());
                for (File file : f.listFiles()) {
                    directoryNode.add(file);
                }
                nodes.add(directoryNode);
            }
        }
        for (FileSystemNode node : nodes) {
            node.print();
            System.out.println(node.countNumOfFiles());
        }
    }
}
