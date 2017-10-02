package xinmai.game.model;

public class SysMsgLog {
    private int id;
    private String server_msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServer_msg() {
        return server_msg;
    }

    public void setServer_msg(String server_msg) {
        this.server_msg = server_msg;
    }

    @Override
    public String toString() {
        return "SysMsgLog{" +
                "id=" + id +
                ", server_msg='" + server_msg + '\'' +
                '}';
    }
}
