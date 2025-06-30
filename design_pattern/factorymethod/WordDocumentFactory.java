package design_pattern.factorymethod;

public class WordDocumentFactory extends DocumentFactory {
     public Document createDocument() {
        return new WordDocument();
    }
}
