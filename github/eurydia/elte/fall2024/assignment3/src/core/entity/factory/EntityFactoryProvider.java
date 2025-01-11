package core.entity.factory;

import core.entity.Entity;
import org.bson.Document;

import java.util.List;

public interface EntityFactoryProvider {
    Entity fromArgs(List<String> args);
    Entity fromDocument(Document document);
}
