package xinmai.game.model;

public class ShaiziYaZhu {
    private int id;
    private String n_id;
    private String daqu;
    private String zhanghao;
    private String jiaose;
    private String daxiao;
    private String yazhu;
    private String zbx;
    private String zby;

    @Override
    public String toString() {
        return "ShaiziYaZhu{" +
                "id=" + id +
                ", n_id='" + n_id + '\'' +
                ", daqu='" + daqu + '\'' +
                ", zhanghao='" + zhanghao + '\'' +
                ", jiaose='" + jiaose + '\'' +
                ", daxiao='" + daxiao + '\'' +
                ", yazhu='" + yazhu + '\'' +
                ", zbx='" + zbx + '\'' +
                ", zby='" + zby + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN_id() {
        return n_id;
    }

    public void setN_id(String n_id) {
        this.n_id = n_id;
    }

    public String getDaqu() {
        return daqu;
    }

    public void setDaqu(String daqu) {
        this.daqu = daqu;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public String getJiaose() {
        return jiaose;
    }

    public void setJiaose(String jiaose) {
        this.jiaose = jiaose;
    }

    public String getDaxiao() {
        return daxiao;
    }

    public void setDaxiao(String daxiao) {
        this.daxiao = daxiao;
    }

    public String getYazhu() {
        return yazhu;
    }

    public void setYazhu(String yazhu) {
        this.yazhu = yazhu;
    }

    public String getZbx() {
        return zbx;
    }

    public void setZbx(String zbx) {
        this.zbx = zbx;
    }

    public String getZby() {
        return zby;
    }

    public void setZby(String zby) {
        this.zby = zby;
    }
}
