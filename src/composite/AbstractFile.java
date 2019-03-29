package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 9:50
 */
public interface AbstractFile {             //抽象组件
    void killVirus();
}

class PictureFile implements AbstractFile{  //叶子
    private String name;

    public PictureFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀" + name + "图像文件");
    }
}

class VedioFile implements AbstractFile{
    private String name;

    public VedioFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀" + name + "视频文件");
    }
}

class Folder implements AbstractFile{
    private String name;
    private List<AbstractFile> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        files.add(file);
    }
    public void remove(AbstractFile file){
        files.remove(file);
    }

    @Override
    public void killVirus() {
        System.out.println("----------文件夹-----------");
        for(AbstractFile f :files) {
            f.killVirus();
        }

    }
}
