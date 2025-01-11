package core.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.ReplaceOptions;
import core.GameStateData;
import core.SaveFileMetadata;
import org.bson.Document;
import org.bson.conversions.Bson;

public class DatabaseService {
    private final MongoClient mongoClient;
    private final MongoDatabase database;
    private final String collectionName;

    public DatabaseService(String uri, String dbName, String collectionName) {
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(dbName);
        this.collectionName = collectionName;
    }


    public void upsertGameSave(SaveFileMetadata metadata, GameStateData gameStateData) {

        Document document = new Document();
        document.append("metadata", metadata.toDocument());
        document.append("gameStateData", gameStateData.toDocument());

        String saveName = metadata.getSaveName();
        Bson filter = Filters.eq("metadata.saveName", saveName);
        ReplaceOptions options = new ReplaceOptions();
        options.upsert(true);

        MongoCollection<Document> collection = database.getCollection(collectionName);
        collection.replaceOne(filter, document, options);
    }

    public Document getGameSave(String saveName) {
        MongoCollection<Document> collection = database.getCollection(collectionName);
        Bson filter = Filters.eq("metadata.saveName", saveName);
        return collection.find(filter).first();
    }

    public Document getDefaultGameSave() {
        return getGameSave("default");
    }
}