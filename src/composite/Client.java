package composite;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 9:59
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f1,f2;
        f1 = new VedioFile("狂想曲.mkv");
        f2 = new PictureFile("dog.jpg");
        Folder f = new Folder("我的收藏");
        f.add(f1);
        f.add(f2);
        f.killVirus();
    }
}
