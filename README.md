# Spring Kafka

## Perf Test

```shell script
kafka-producer-perf-test.sh \
  --topic simple-message \
  --num-records 50 \
  --record-size 10 \
  --throughput -1 \
  --producer-props acks=1 \
    bootstrap.servers=localhost:9092
```

