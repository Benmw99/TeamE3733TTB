package Entities;

import java.io.InputStream;
import java.util.Objects;

public class LabelImage {
    private int ID;
    private String imageName;
    private InputStream image;

    public LabelImage(int ID, String imageName, InputStream image) {
        this.ID = ID;
        this.imageName = imageName;
        this.image = image;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabelImage that = (LabelImage) o;
        return ID == that.ID &&
                Objects.equals(imageName, that.imageName) &&
                Objects.equals(image, that.image);
    }

}
