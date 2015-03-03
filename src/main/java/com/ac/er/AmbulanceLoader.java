package com.ac.er;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.ac.er.data.Ambulance;

/**
 * @author ac010168
 *
 */
public class AmbulanceLoader {
  
  public static List<Ambulance> buildAmbulanceList() {
    List<Ambulance> ambulances = new LinkedList<Ambulance>();
    
    ambulances.add(createAmbulance1000());
    ambulances.add(createAmbulance1001());
    
    ambulances.add(createAmbulance2000());
    ambulances.add(createAmbulance2001());
    ambulances.add(createAmbulance2002());
    ambulances.add(createAmbulance2003());
    ambulances.add(createAmbulance2004());
    ambulances.add(createAmbulance2005());
    
    return ambulances;
  }

  private static Ambulance createAmbulance1000() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(1000);
    a.setAmbLat(39.296470);
    a.setAmbLon(-94.487637);
    a.setLastUpdate(new Date());
    a.setTargetHospital(6003);  //Liberty Hospital
    a.setEta("8:20");
    a.setPatientAge("adult");
    a.setPatientCategory("basicER");
    
    return a;
  }
  
  private static Ambulance createAmbulance1001() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(1001);
    a.setAmbLat(38.947451);
    a.setAmbLon(-94.529265);
    a.setLastUpdate(new Date());
    a.setTargetHospital(5000);  //St. Jospeph Medical Center
    a.setEta("9:00");
    a.setPatientAge("adult");
    a.setPatientCategory("basicER");
    
    return a;
  }
  
  private static Ambulance createAmbulance2000() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(2000);
    a.setAmbLat(39.012105);
    a.setAmbLon(-94.636811);
    
    return a;
  }

  private static Ambulance createAmbulance2001() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(2001);
    a.setAmbLat(39.105078);
    a.setAmbLon(-94.600676);
    
    return a;
  }
  
  private static Ambulance createAmbulance2002() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(2002);
    a.setAmbLat(39.172715);
    a.setAmbLon(-94.596385);
    
    return a;
  }

  private static Ambulance createAmbulance2003() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(2003);
    a.setAmbLat(39.168923);
    a.setAmbLon(-94.572266);
    
    return a;
  }

  private static Ambulance createAmbulance2004() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(2004);
    a.setAmbLat(39.249793);
    a.setAmbLon(-94.642733);
    
    return a;
  }

  private static Ambulance createAmbulance2005() {
    Ambulance a = new Ambulance();
    a.setAmbulanceID(2005);
    a.setAmbLat(39.138705);
    a.setAmbLon(-94.353484);
    
    return a;
  }
}
