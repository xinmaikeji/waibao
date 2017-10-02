package xinmai.game.model;

public class YinHang {
    private int id;
    private String zhanghao;
    private int yuanbao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public int getYuanbao() {
        return yuanbao;
    }

    public void setYuanbao(int yuanbao) {
        this.yuanbao = yuanbao;
    }

    @Override
    public String toString() {
        return "YinHang{" +
                "id=" + id +
                ", zhanghao='" + zhanghao + '\'' +
                ", yuanbao=" + yuanbao +
                '}';
    }
}
