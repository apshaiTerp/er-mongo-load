# er-mongo-load
This is a simple MongoDB load script in Java for our Hospital Data set

If you want to look at the source code, it's all included above.

To run the file locally, you will first need to have your MongoDB instance up and running.  It's assumed you will be uploading to localhost and port 27017.  You will then need to clone this project to your own device (or download the jar files) and run the following command:

java -jar target/er-mongo-load-0.1.0-SNAPSHOT-jar-with-dependencies.jar

(Don't use the basic jar file, you need to run the version with dependencies)

This will upload all the hospital data and some ambulance data to the "erdb" database in Mongo to two collections, ambulance and hospital.

If you want to override the MongoDB locations, they are overridable as command line parameters:

java -jar target/er-mongo-load-0.1.0-SNAPSHOT-jar-with-dependencies.jar <host address> <port> <database name>

So, for example:
java -jar target/er-mongo-load-0.1.0-SNAPSHOT-jar-with-dependencies.jar 127.0.0.1 27017 mockDB

Also included in this project is a file named "JSON Samples.txt", which has a couple of the Mongo Queries and their JSON output.  This should help those of you needing to see what the JSON content might look like that your app needs.
