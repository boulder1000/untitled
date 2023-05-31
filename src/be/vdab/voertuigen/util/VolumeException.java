package be.vdab.voertuigen.util;

public class VolumeException extends RuntimeException{
private String message;

    public VolumeException() {
    }

    public VolumeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
