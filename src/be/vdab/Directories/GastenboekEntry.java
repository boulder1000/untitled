package be.vdab.Directories;

import java.time.LocalDateTime;

public class GastenboekEntry {
    private LocalDateTime date;
    private String shrijver,boodschap;

    public GastenboekEntry(LocalDateTime date, String shrijver, String boodschap) {
        this.date = date;
        this.shrijver = shrijver;
        this.boodschap = boodschap;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
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
