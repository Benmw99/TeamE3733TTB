package UI;

import Entities.Form;
import Entities.IUser;
import Entities.SearchResult;

import java.applet.AudioClip;
import java.util.List;

public class AttributeContainer {
    private static AttributeContainer ourInstance = new AttributeContainer();

    public static AttributeContainer getInstance() {
        return ourInstance;
    }

    List<Form> formQueue;
    Form currentForm;
    IUser currentUser;
    SearchResult currentResults;
    List<AudioClip> sounds;
    int searchPage;

    private AttributeContainer() {
        formQueue = null;
        currentForm = null;
        currentUser = null;
        currentResults = null;
        sounds = null;
        searchPage = 0;
    }
}
