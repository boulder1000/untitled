package be.vdab.Directories;

import java.io.Serializable;
import java.time.LocalDateTime;

public class GastenboekEntry implements Serializable {
    private final LocalDateTime date =LocalDateTime.now();
    private String shrijver,boodschap;

    public GastenboekEntry( String shrijver, String boodschap) {
        this.shrijver = shrijver;
        this.boodschap = boodschap;
    }


    public LocalDateTime getDate() {
        return date;
    }

    public String getShrijver() {
        return shrijver;
    }

    public void setShrijver(String shrijver) {
        this.shrijver = shrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }

    public void setBoodschap(String boodschap) {
        this.boodschap = boodschap;
    }

    //region to-string
    @Override
    public String toString() {
        return "GastenboekEntry{" +
                "date=" + date +
                ", shrijver='" + shrijver + '\'' +
                ", boodschap='" + boodschap + '\'' +
                '}';
    }
    //endregion
}
