package xinmai.game.model;

public class ShaiziZuozhangPaidui {
    private int id;
    private String n_id;
    private String daqu;
    private String zhanghao;
    private String jiaose;
    private int benqian;

    @Override
    public String toString() {
        return "ShaiziZuozhangPaidui{" +
                "id=" + id +
                ", n_id='" + n_id + '\'' +
                ", daqu='" + daqu + '\'' +
                ", zhanghao='" + zhanghao + '\'' +
                ", jiaose='" + jiaose + '\'' +
                ", benqian=" + benqian +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setN_id(String n_id) {
        this.n_id = n_id;
    }

    public void setDaqu(String daqu) {
        this.daqu = daqu;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public void setJiaose(String jiaose) {
        this.jiaose = jiaose;
    }

    public void setBenqian(int benqian) {
        this.benqian = benqian;
    }

    public int getId() {

        return id;
    }

    public String getN_id() {
        return n_id;
    }

    public String getDaqu() {
        return daqu;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public String getJiaose() {
        return jiaose;
    }

    public int getBenqian() {
        return benqian;
    }
}
