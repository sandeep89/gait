# Gait
Gait analytics for all the user foot print

### Spring boot project to create GC analytics platform using 

1. Google app engine
2. Google pub sub
3. Google cloud dataflow
4. Bigquery


System involves 2 main componets
- Collector: App running on google app engine which collects all data log request and pushes then to google pub sub.
- Analyser: App/Rule running on google dataflow to process the pub/sub data

