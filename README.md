# kafka-spring-exactly-once
Sample of exactly once processing for Spring plus Kafka.

Sample CURL command to trigger event producer:
```bash
curl -X POST \
  -H "Content-Type: application/json" \
  -d '{
    "uniqueId": "123",
    "name": "John",
    "value": "42"
  }' \
  http://localhost:8080/api/send
```
