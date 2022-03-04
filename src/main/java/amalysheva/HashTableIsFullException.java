package amalysheva;

public class HashTableIsFullException extends RuntimeException {
    public HashTableIsFullException(String message) {
        super(message);
    }
}