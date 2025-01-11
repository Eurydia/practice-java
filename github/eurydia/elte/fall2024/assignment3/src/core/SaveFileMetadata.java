package core;

import org.bson.Document;

import java.util.List;
import java.util.Set;

public class SaveFileMetadata {
    private String saveName;
    private boolean hasReachedGoal;

    public SaveFileMetadata() {
        saveName = "default";
        hasReachedGoal = false;
    }

    public SaveFileMetadata(Document document) {
        Set<String> keySet = document.keySet();
        if (!keySet.containsAll(List.of("saveName", "hasReachedGoal"))) {
            throw new IllegalArgumentException();
        }

        saveName = document.getString("saveName");
        hasReachedGoal = document.getBoolean("hasReachedGoal");
    }

    public boolean hasReachedGoal() {
        return hasReachedGoal;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public void setGoalReached() {
        if (!hasReachedGoal) {
            hasReachedGoal = true;
        }
    }

    public Document toDocument() {
        Document repr = new Document();
        repr.append("saveName", saveName);
        repr.append("hasReachedGoal", hasReachedGoal);
        return repr;
    }
}
