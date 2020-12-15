import java.io.Serializable;

public class Pack implements Serializable{

    private final String name, gameVersion, fPath;
    private String version;
    private boolean scripts;
    private final int id;
    private final long serialVersionUID;

    public Pack(String name, String version, String gameVersion, String fPath, int id) {
        this.name = name;
        this.version = version;
        this.gameVersion = gameVersion;
        this.fPath = fPath;
        this.id = id;
        this.serialVersionUID = id;
    }
}
