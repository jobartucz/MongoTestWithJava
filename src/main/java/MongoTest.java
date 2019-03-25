import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class MongoTest {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        // MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        // MongoClient mongoClient = new MongoClient(connectionString);

        MongoClient mongoClient = new MongoClient();

        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("users");

        Document doc = new Document("firstname", "Frodo")
                .append("lastname", "Baggins");

        collection.insertOne(doc);


    }
}
