package com.ac.er;

import java.net.UnknownHostException;

import com.ac.er.data.Ambulance;
import com.ac.er.data.Hospital;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

/**
 * @author ac010168
 *
 */
public class DataLoader {
  
  private String databaseHost;
  private int    databasePort;
  private String databaseName;

  public static void main(String[] args) {
    DataLoader load = new DataLoader();
    
    if (args.length >= 1)
      load.setDatabaseHost(args[0]);
    if (args.length >= 2)
      load.setDatabasePort(Integer.parseInt(args[1]));
    if (args.length >= 3)
      load.setDatabaseName(args[3]);
    
    load.loadData();
  }
  
  public DataLoader() {
    //This represents the default values of the database.  Values will be set to defaults
    //unless overridden by the command line arguments
    databaseHost = "localhost";
    databasePort = 27017;
    databaseName = "erdb";
  }
  
  public void loadData() {
    System.out.println ("databaseHost: " + databaseHost);
    System.out.println ("databasePort: " + databasePort);
    System.out.println ("databaseName: " + databaseName);
    
    try {
      //Open our MongoClient
      MongoClient client = new MongoClient(databaseHost, databasePort);
      client.setWriteConcern(WriteConcern.JOURNALED);
      
      //Connect to our database instance
      DB mongoDB = client.getDB(databaseName);
      
      //Collections are like tables
      //Let's start with loading our hospitals
      DBCollection hospitals = mongoDB.getCollection("hospital");
      for (Hospital hospital : HospitalLoader.buildHospitalList()) {
        BasicDBObject writeObject = new BasicDBObject();
        
        //Convert our Hospital into a BSON object
        writeObject.append("hospitalID", hospital.getHospitalID());
        writeObject.append("hospitalName", hospital.getHospitalName());
        writeObject.append("lat", hospital.getHospitalLat());
        writeObject.append("lon", hospital.getHospitalLon());
        writeObject.append("address", hospital.getHospitalString());
        writeObject.append("levelOfCare", hospital.getHospitalStatus());
        writeObject.append("patientAges", convertList(hospital.getHostAges()));
        writeObject.append("traumaBeds", hospital.getTraumaBeds());
        writeObject.append("traumaBedsFree", hospital.getTraumaBedsFree());
        writeObject.append("traumaBedsOccupied", hospital.getTraumaBedsOccupied());
        writeObject.append("traumaBedsCleanup", hospital.getTraumaBedsCleanup());
        writeObject.append("erBeds", hospital.getErBeds());
        writeObject.append("erBedsFree", hospital.getErBedsFree());
        writeObject.append("erBedsOccupied", hospital.getErBedsOccupied());
        writeObject.append("erBedsCleanup", hospital.getErBedsCleanup());
       
        //This is a simple query, which will allow us to find this object if it already exists
        BasicDBObject updateCheckObject = new BasicDBObject();
        updateCheckObject.append("hospitalID", hospital.getHospitalID());
        
        //We're using an update with the provision that it becomes an upsert so that we can
        //reload this data to 'reset' the contents of our system at any time.
        hospitals.update(updateCheckObject, writeObject, true, false);
      }

      //Let's start with loading our hospitals
      DBCollection ambulances = mongoDB.getCollection("ambulance");
      for (Ambulance ambulance : AmbulanceLoader.buildAmbulanceList()) {
        BasicDBObject writeObject = new BasicDBObject();
        
        //Convert our Ambulance into a BSON object
        //These three fields are always present
        writeObject.append("ambulanceID", ambulance.getAmbulanceID());
        writeObject.append("lat", ambulance.getAmbLat());
        writeObject.append("lon", ambulance.getAmbLon());
        
        if (ambulance.getLastUpdate() != null)      writeObject.append("lastUpdate", ambulance.getLastUpdate());
        if (ambulance.getTargetHospital() != -1)    writeObject.append("targetHospital", ambulance.getTargetHospital());
        if (ambulance.getEta() != null)             writeObject.append("eta", ambulance.getEta());
        if (ambulance.getPatientAge() != null)      writeObject.append("patientAge", ambulance.getEta());
        if (ambulance.getPatientCategory() != null) writeObject.append("patientCategory", ambulance.getPatientCategory());
       
        //This is a simple query, which will allow us to find this object if it already exists
        BasicDBObject updateCheckObject = new BasicDBObject();
        updateCheckObject.append("ambulanceID", ambulance.getAmbulanceID());
        
        //We're using an update with the provision that it becomes an upsert so that we can
        //reload this data to 'reset' the contents of our system at any time.
        ambulances.update(updateCheckObject, writeObject, true, false);
      }

      client.close();
    } catch (UnknownHostException e) {
      System.out.println ("Your database host is probably not running: " + e.getMessage());
      e.printStackTrace();
    } catch (MongoException me) {
      System.out.println ("Your Mongo query/insert looks wrong: " + me.getMessage());
      me.printStackTrace();
    } catch (Throwable t) {
      System.out.println ("Something bad happened here: " + t.getMessage());
      t.printStackTrace();
    }
  }

  /**
   * @return the databaseHost
   */
  public String getDatabaseHost() {
    return databaseHost;
  }

  /**
   * @param databaseHost the databaseHost to set
   */
  public void setDatabaseHost(String databaseHost) {
    this.databaseHost = databaseHost;
  }

  /**
   * @return the databasePort
   */
  public int getDatabasePort() {
    return databasePort;
  }

  /**
   * @param databasePort the databasePort to set
   */
  public void setDatabasePort(int databasePort) {
    this.databasePort = databasePort;
  }

  /**
   * @return the databaseName
   */
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * @param databaseName the databaseName to set
   */
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Helper method to parse Lists into List format for Mongo.  Parameterized as <?> to
   * allow for generic mapping, provided those objects are simple objects.
   * 
   * @param curList The List of elements (not null) to be converted into an array.
   * @return A new list in BasicDBList format.
   */
  private static BasicDBList convertList(String[] curList) {
    if (curList == null) return null;
    
    BasicDBList newList = new BasicDBList();
    for (Object obj : curList)
      newList.add(obj);
    return newList;
  }
  
}
