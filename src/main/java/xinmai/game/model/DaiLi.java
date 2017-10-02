package xinmai.game.model;

public class DaiLi {
    private String zhanghao;
    private String daili_id;

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public String getDaili_id() {
        return daili_id;
    }

    public void setDaili_id(String daili_id) {
        this.daili_id = daili_id;
    }

    @Override
    public String toString() {
        return "DaiLi{" +
                "zhanghao='" + zhanghao + '\'' +
                ", daili_id='" + daili_id + '\'' +
                '}';
    }
}
