package xinmai.game.model;

public class SysMsg {
    private int id;
    private String daqu;
    private String zhanghao;
    private String jiaose;
    private String txt;
    private int s1;
    private int s2;
    private int s3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "SysMsg{" +
                "id=" + id +
                ", daqu='" + daqu + '\'' +
                ", zhanghao='" + zhanghao + '\'' +
                ", jiaose='" + jiaose + '\'' +
                ", txt='" + txt + '\'' +
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }
}
